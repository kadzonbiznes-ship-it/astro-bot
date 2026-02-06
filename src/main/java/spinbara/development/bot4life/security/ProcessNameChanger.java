package spinbara.development.bot4life.security;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;

public class ProcessNameChanger {
    
    private static final int PROCESS_NAME_WIN32 = 0;
    private static final int PROCESS_BASIC_INFORMATION = 0;
    
    public interface NtDll extends StdCallLibrary {
        NtDll INSTANCE = Native.load("ntdll", NtDll.class, W32APIOptions.UNICODE_OPTIONS);
        
        int NtQueryInformationProcess(
            WinNT.HANDLE ProcessHandle,
            int ProcessInformationClass,
            Pointer ProcessInformation,
            int ProcessInformationLength,
            IntByReference ReturnLength
        );
        
        int NtSetInformationProcess(
            WinNT.HANDLE ProcessHandle,
            int ProcessInformationClass,
            Pointer ProcessInformation,
            int ProcessInformationLength
        );
    }
    
    public static class UNICODE_STRING extends com.sun.jna.Structure {
        public short Length;
        public short MaximumLength;
        public Pointer Buffer;
        
        public UNICODE_STRING() {
            super();
        }
        
        public UNICODE_STRING(Pointer p) {
            super(p);
            read();
        }
        
        @Override
        protected java.util.List<String> getFieldOrder() {
            return java.util.Arrays.asList("Length", "MaximumLength", "Buffer");
        }
    }
    
    public static class PROCESS_BASIC_INFORMATION_STRUCT extends com.sun.jna.Structure {
        public Pointer Reserved1;
        public Pointer PebBaseAddress;
        public Pointer Reserved2_0;
        public Pointer Reserved2_1;
        public Pointer UniqueProcessId;
        public Pointer Reserved3;
        
        @Override
        protected java.util.List<String> getFieldOrder() {
            return java.util.Arrays.asList("Reserved1", "PebBaseAddress", "Reserved2_0", 
                "Reserved2_1", "UniqueProcessId", "Reserved3");
        }
    }
    
    public static boolean changeProcessName() {
        return changeProcessNameAlternative();
    }
    
    private static boolean changeProcessNameAlternative() {
        try {
            System.setProperty("java.class.path", "obs64.exe");
            System.setProperty("sun.java.command", "obs64.exe");
            
            try {
                System.setProperty("user.dir", "obs64.exe");
            } catch (Exception e) {
            }
            
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                try {
                    Kernel32.INSTANCE.SetConsoleTitle("obs64.exe");
                } catch (Exception e) {
                }
            }
            
            try {
                java.lang.reflect.Field field = System.class.getDeclaredField("props");
                field.setAccessible(true);
                @SuppressWarnings("unchecked")
                java.util.Properties props = (java.util.Properties) field.get(null);
                props.setProperty("java.class.path", "obs64.exe");
                props.setProperty("sun.java.command", "obs64.exe");
            } catch (Exception e) {
            }
            
            try {
                modifyCommandLineInMemory();
            } catch (Exception e) {
            }
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private static void modifyCommandLineInMemory() {
        try {
            WinNT.HANDLE currentProcess = Kernel32.INSTANCE.GetCurrentProcess();
            
            PROCESS_BASIC_INFORMATION_STRUCT pbi = new PROCESS_BASIC_INFORMATION_STRUCT();
            IntByReference returnLength = new IntByReference();
            
            int status = NtDll.INSTANCE.NtQueryInformationProcess(
                currentProcess,
                PROCESS_BASIC_INFORMATION,
                pbi.getPointer(),
                pbi.size(),
                returnLength
            );
            
            if (status == 0) {
                pbi.read();
                if (pbi.PebBaseAddress != null) {
                }
            }
        } catch (Exception e) {
        }
    }
    
    public static void init() {
        try {
            boolean success = changeProcessName();
            
            if (!success) {
                changeProcessNameAlternative();
            }
            
            System.setProperty("sun.java.command", "obs64.exe");
            
        } catch (Exception e) {
        }
    }
}

