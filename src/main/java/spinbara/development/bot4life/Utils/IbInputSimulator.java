package spinbara.development.bot4life.Utils;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;
import java.awt.Robot;

public class IbInputSimulator {
public static interface IbInputSimulatorLib extends Library {
int IbSendInit(int param1Int1, int param1Int2, String param1String, int param1Int3);

public static final IbInputSimulatorLib INSTANCE = (IbInputSimulatorLib)Native.load("IbInputSimulator", IbInputSimulatorLib.class);

void IbSendInputHook(int param1Int);

void IbSendDestroy();

void IbSendSyncKeyStates();
}

public enum SendType {
ANY_DRIVER(0),
SEND_INPUT(1),
LOGITECH(2),
LOGITECH_GHUB_NEW(6),
RAZER(3),
DD(4),
MOU_CLASS_INPUT_INJECTION(5);

private final int value;

SendType(int value) {
this.value = value;
}

public int getValue() {
return this.value;
}
}


private static final String[] ERROR_TEXTS = new String[] { "InvalidArgument", "LibraryNotFound", "LibraryLoadFailed", "LibraryError", "DeviceCreateFailed", "DeviceNotFound", "DeviceOpenFailed" };



private Robot robot;



private IbInputSimulatorLib nativeLib;




public IbInputSimulator() {
try {
this.robot = new Robot();
this.nativeLib = IbInputSimulatorLib.INSTANCE;
} catch (Exception e) {
throw new RuntimeException("Failed to initialize Robot or native library", e);
} 
}








public void initialize(SendType sendType, int mode, String... args) {
String arg = (args.length > 0) ? args[0] : null;
int result = this.nativeLib.IbSendInit(sendType
.getValue(), mode, arg, 0);





if (result != 0) {
throw new RuntimeException("Initialization error: " + ((
result > 0 && result <= ERROR_TEXTS.length) ? ERROR_TEXTS[result - 1] : "Unknown error"));
}
System.out.println("Chyba smiga");



if (mode != 0) {
setMode(mode);
}
}






public void setMode(int mode) {
if (mode == 1) {
this.nativeLib.IbSendInputHook(1);
} else if (mode == 0) {
this.nativeLib.IbSendInputHook(0);
} else {
throw new IllegalArgumentException("Invalid send mode");
} 
}




public void destroy() {
this.nativeLib.IbSendDestroy();
}




public void syncKeyStates() {
this.nativeLib.IbSendSyncKeyStates();
}





public void sendInput(String text) {
this.nativeLib.IbSendInputHook(1);


try {
this.robot.setAutoDelay(20);

for (char c : text.toCharArray()) {
sendChar(c);
}
System.out.println("klik");
} finally {
this.nativeLib.IbSendInputHook(0);
} 
}





public void sendKeyCombo(String... keys) {
this.nativeLib.IbSendInputHook(1);

try {
this.robot.setAutoDelay(20);


for (String key : keys) {
pressSpecialKey(key);
}
} finally {
this.nativeLib.IbSendInputHook(0);
} 
}

public static interface User32 extends StdCallLibrary {
public static final User32 INSTANCE = (User32)Native.load("user32", User32.class);

public static final int VK_LMENU = 164;

public static final int KEYEVENTF_KEYUP = 2;
public static final int KEYEVENTF_EXTENDEDKEY = 1;

void keybd_event(byte param1Byte1, byte param1Byte2, int param1Int1, int param1Int2);
}

public void sendLeftAlt() {
this.nativeLib.IbSendInputHook(1);

User32.INSTANCE.keybd_event((byte)-92, (byte)0, 1, 0);


User32.INSTANCE.keybd_event((byte)-92, (byte)0, 3, 0);

this.nativeLib.IbSendInputHook(0);
}






private void sendChar(char c) {
boolean isUpperCase = Character.isUpperCase(c);

if (isUpperCase) {
this.robot.keyPress(16);
}


int keyCode = getKeyCode(c);

if (keyCode != -1) {
this.robot.keyPress(keyCode);
this.robot.keyRelease(keyCode);
} 

if (isUpperCase) {
this.robot.keyRelease(16);
}
}





private void pressSpecialKey(String key) {
switch (key.toUpperCase()) {
case "ALT":
this.robot.keyPress(18);
this.robot.keyRelease(18);
return;
case "CTRL":
this.robot.keyPress(17);
this.robot.keyRelease(17);
return;
case "SHIFT":
this.robot.keyPress(16);
this.robot.keyRelease(16);
return;
case "WIN":
this.robot.keyPress(524);
this.robot.keyRelease(524);
return;
case "TAB":
this.robot.keyPress(9);
this.robot.keyRelease(9);
return;
case "ENTER":
this.robot.keyPress(10);
this.robot.keyRelease(10);
return;
case "ESC":
this.robot.keyPress(27);
this.robot.keyRelease(27);
return;
} 

if (key.contains("+")) {
String[] parts = key.split("\\+");
pressKeyCombination(parts);
} else {

sendInput(key);
} 
}







private void pressKeyCombination(String[] keys) {
for (int i = 0; i < keys.length - 1; i++) {
int keyCode = getSpecialKeyCode(keys[i]);
if (keyCode != -1) {
this.robot.keyPress(keyCode);
}
} 


int lastKeyCode = getSpecialKeyCode(keys[keys.length - 1]);
if (lastKeyCode != -1) {
this.robot.keyPress(lastKeyCode);
this.robot.keyRelease(lastKeyCode);
} 


for (int j = keys.length - 2; j >= 0; j--) {
int keyCode = getSpecialKeyCode(keys[j]);
if (keyCode != -1) {
this.robot.keyRelease(keyCode);
}
} 
}






private int getKeyCode(char c) {
if (Character.isLetterOrDigit(c)) {
return Character.toUpperCase(c);
}

switch (c) { case ' ':
return 32;
case '.': return 46;
case ',': return 44;
case '!': return 517;
case '@': return 512;
case '#': return 520;
case '$': return 515;
case '^': return 514;
case '&': return 150;
case '*': return 151;
case '(': return 519;
case ')': return 522;
case '-': return 45;
case '_': return 523;
case '+': return 521;
case '=': return 61;
case '[': return 91;
case ']': return 93;
case '{': return 161;
case '}': return 162;
case '\\': return 92;
case '|': return 92;
case ';': return 59;
case ':': return 513;
case '\'': return 222;
case '"': return 152;
case '/': return 47;
case '`': return 192;
case '~': return 192; }
return -1;
}







private int getSpecialKeyCode(String key) {
switch (key.toUpperCase()) { case "ALT":
return 18;
case "CTRL": return 17;
case "SHIFT": return 16;
case "WIN": return 524;
case "F1": return 112;
case "F2": return 113;
case "F3": return 114;
case "F4": return 115;
case "F5": return 116;
case "F6": return 117;
case "F7": return 118;
case "F8": return 119;
case "F9": return 120;
case "F10": return 121;
case "F11": return 122;
case "F12": return 123; }


return getKeyCode(key.charAt(0));
}

    private boolean mousePressed = false;

    public static interface User32Mouse extends StdCallLibrary {
        User32Mouse INSTANCE = (User32Mouse)Native.load("user32", User32Mouse.class);
        
        int MOUSEEVENTF_LEFTDOWN = 0x0002;
        int MOUSEEVENTF_LEFTUP = 0x0004;
        int MOUSEEVENTF_RIGHTDOWN = 0x0008;
        int MOUSEEVENTF_RIGHTUP = 0x0010;
        int MOUSEEVENTF_MIDDLEDOWN = 0x0020;
        int MOUSEEVENTF_MIDDLEUP = 0x0040;
        
        void mouse_event(int dwFlags, int dx, int dy, int dwData, int dwExtraInfo);
    }

    public void mousePress(int button) {
        if (button == 1) {
            User32Mouse.INSTANCE.mouse_event(User32Mouse.MOUSEEVENTF_LEFTDOWN, 0, 0, 0, 0);
        } else if (button == 2) {
            User32Mouse.INSTANCE.mouse_event(User32Mouse.MOUSEEVENTF_RIGHTDOWN, 0, 0, 0, 0);
        } else if (button == 3) {
            User32Mouse.INSTANCE.mouse_event(User32Mouse.MOUSEEVENTF_MIDDLEDOWN, 0, 0, 0, 0);
        }
        this.mousePressed = true;
    }

    public void mouseRelease(int button) {
        if (button == 1) {
            User32Mouse.INSTANCE.mouse_event(User32Mouse.MOUSEEVENTF_LEFTUP, 0, 0, 0, 0);
        } else if (button == 2) {
            User32Mouse.INSTANCE.mouse_event(User32Mouse.MOUSEEVENTF_RIGHTUP, 0, 0, 0, 0);
        } else if (button == 3) {
            User32Mouse.INSTANCE.mouse_event(User32Mouse.MOUSEEVENTF_MIDDLEUP, 0, 0, 0, 0);
        }
        this.mousePressed = false;
    }

    public void sendMouseClick(long pressTime) {
        new Thread(() -> {
            mousePress(1);
            try {
                Thread.sleep(pressTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            mouseRelease(1);
        }).start();
    }

    public void sendMousePress() {
        mousePress(1);
    }

    public void sendMouseRelease() {
        mouseRelease(1);
    }

    public boolean isMousePressed() {
        return this.mousePressed;
    }
}
