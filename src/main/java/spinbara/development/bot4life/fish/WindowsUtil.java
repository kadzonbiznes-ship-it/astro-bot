package spinbara.development.bot4life.fish;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.win32.StdCallLibrary;

public class WindowsUtil {
    public static final String MTA_WINDOW_NAME = "MTA: San Andreas";

    public interface User32Extended extends StdCallLibrary {
        User32Extended INSTANCE = Native.load("user32", User32Extended.class);

        WinDef.HWND GetForegroundWindow();
        int GetWindowTextW(WinDef.HWND hWnd, char[] lpString, int nMaxCount);
        WinDef.HWND FindWindowW(String lpClassName, String lpWindowName);
        boolean GetWindowRect(WinDef.HWND hWnd, WinDef.RECT lpRect);
        boolean GetClientRect(WinDef.HWND hWnd, WinDef.RECT lpRect);
        boolean ClientToScreen(WinDef.HWND hWnd, WinDef.POINT lpPoint);
        void SetProcessDPIAware();
        boolean EnumWindows(WinUser.WNDENUMPROC lpEnumFunc, Pointer userData);
        boolean IsWindowVisible(WinDef.HWND hWnd);
    }

    public static boolean isMtaSanAndreasFocused() {
        WinDef.HWND hwnd = User32Extended.INSTANCE.GetForegroundWindow();
        if (hwnd != null) {
            char[] buffer = new char[1024];
            User32Extended.INSTANCE.GetWindowTextW(hwnd, buffer, buffer.length);
            String title = Native.toString(buffer).trim();
            return MTA_WINDOW_NAME.equals(title);
        }
        return false;
    }

    public static boolean doesWindowExist(String windowTitle) {
        WinDef.HWND hwnd = User32Extended.INSTANCE.FindWindowW(null, windowTitle);
        return hwnd != null;
    }

    public static WinDef.RECT getWindowResolutionByTitle(String windowTitle) {
        WinDef.HWND hwnd = User32Extended.INSTANCE.FindWindowW(null, windowTitle);
        if (hwnd != null) {
            WinDef.RECT rect = new WinDef.RECT();
            if (User32Extended.INSTANCE.GetWindowRect(hwnd, rect)) {
                return rect;
            }
        }
        
        hwnd = findWindowByPartialTitle(windowTitle);
        if (hwnd != null) {
            WinDef.RECT rect = new WinDef.RECT();
            if (User32Extended.INSTANCE.GetWindowRect(hwnd, rect)) {
                return rect;
            }
        }
        
        if (windowTitle.contains("MTA")) {
            hwnd = findWindowByPartialTitle("MTA");
            if (hwnd != null) {
                WinDef.RECT rect = new WinDef.RECT();
                if (User32Extended.INSTANCE.GetWindowRect(hwnd, rect)) {
                    return rect;
                }
            }
        }
        
        return null;
    }
    
    private static WinDef.HWND findWindowByPartialTitle(String partialTitle) {
        final WinDef.HWND[] foundHwnd = new WinDef.HWND[1];
        final String searchTitle = partialTitle.toLowerCase();
        
        WinUser.WNDENUMPROC enumProc = new WinUser.WNDENUMPROC() {
            @Override
            public boolean callback(WinDef.HWND hwnd, Pointer userData) {
                if (hwnd == null) {
                    return true;
                }
                
                if (!User32Extended.INSTANCE.IsWindowVisible(hwnd)) {
                    return true;
                }
                
                char[] buffer = new char[1024];
                int length = User32Extended.INSTANCE.GetWindowTextW(hwnd, buffer, buffer.length);
                if (length > 0) {
                    String title = new String(buffer, 0, length).trim().toLowerCase();
                    if (title.contains(searchTitle)) {
                        foundHwnd[0] = hwnd;
                        return false;
                    }
                }
                return true;
            }
        };
        
        User32Extended.INSTANCE.EnumWindows(enumProc, null);
        return foundHwnd[0];
    }
}





