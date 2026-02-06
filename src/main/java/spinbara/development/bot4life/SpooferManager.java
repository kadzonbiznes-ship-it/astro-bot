package spinbara.development.bot4life;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpooferManager {
    private static final String VPS_IP = "localhost";
    private static final String VPS_PORT = "8888";
    private static final String VPS_BASE_URL = "http://" + VPS_IP + ":" + VPS_PORT;
    private static final String[] FILES_TO_DOWNLOAD = {
        "spinbaraBypass.dll",
        "spoofer.sys",
        "kdmapper.exe",
        "Injector.exe",
        "DELETE-LOGS.bat",
        "change_Disk_serial.sys"
    };
    
    public static void run_win_spoofer() {
        new Thread(() -> {
            try {
                String temp_dir = System.getenv("TEMP");
                if (temp_dir == null) {
                    temp_dir = System.getProperty("java.io.tmpdir");
                }
                
                Path temp_path = Paths.get(temp_dir);
                List<Path> downloaded_files = new ArrayList<>();
                
                String random_title = generate_random_string();
                String cmd_script = create_cmd_script(temp_path, downloaded_files, random_title);
                Path script_path = temp_path.resolve("spoofer_launcher.bat");
                Files.write(script_path, cmd_script.getBytes("UTF-8"));
                
                ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "start", "\"\"", script_path.toString());
                pb.start();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
    
    private static String generate_random_string() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }
    
    private static String create_cmd_script(Path temp_path, List<Path> downloaded_files, String random_title) {
        StringBuilder script = new StringBuilder();
        script.append("@echo off\n");
        script.append("title Administrator: ").append(random_title).append("\n");
        script.append("mode con: cols=100 lines=30\n");
        script.append("setlocal enabledelayedexpansion\n");
        script.append("color 0B\n");
        script.append("cls\n");
        
        script.append(":menu\n");
        script.append("cls\n");
        script.append("echo.\n");
        script.append("powershell -Command \"Write-Host '     _   ___ _____ ___  ___    ___ ___  ___   ___  ___ ___ ___ ' -ForegroundColor Cyan; Write-Host '    /_\\ / __|_   _| _ \\/ _ \\  / __| _ \\/ _ \\ / _ \\| __| __| _ \\' -ForegroundColor Cyan; Write-Host '   / _ \\\\__ \\ | | |   / (_) | \\__ \\  _/ (_) | (_) | _|| _||   /' -ForegroundColor Cyan; Write-Host '  /_/ \\_\\___/ |_| |_|_\\\\___/  |___/_|  \\___/ \\___/|_| |___|_|_\\' -ForegroundColor Cyan; Write-Host '                                                               ' -ForegroundColor Cyan; Write-Host ''\"\n");
        script.append("powershell -Command \"Write-Host ' Welcome back, ' -NoNewline -ForegroundColor White; Write-Host '%USERNAME%!' -ForegroundColor Cyan\"\n");
        script.append("powershell -Command \"Write-Host ' Website: ' -NoNewline -ForegroundColor White; Write-Host 'https://astro-bot.online/' -ForegroundColor Cyan\"\n");
        script.append("powershell -Command \"Write-Host ' Discord: ' -NoNewline -ForegroundColor White; Write-Host 'https://discord.gg/z5ABjbBXHA' -ForegroundColor Cyan\"\n");
        script.append("powershell -Command \"Write-Host ' Version: ' -NoNewline -ForegroundColor White; Write-Host '1.1' -ForegroundColor Cyan\"\n");
        script.append("echo.\n");
        script.append("powershell -Command \"Write-Host ' [1]' -NoNewline -ForegroundColor Cyan; Write-Host ' - Advanced Clean & Spoof' -ForegroundColor White\"\n");
        script.append("powershell -Command \"Write-Host ' [2]' -NoNewline -ForegroundColor Cyan; Write-Host ' - Exit' -ForegroundColor White\"\n");
        script.append("echo.\n");
        script.append("powershell -Command \"Write-Host ' [^>]' -NoNewline -ForegroundColor Cyan; Write-Host ' - Select an option: ' -NoNewline -ForegroundColor White\"\n");
        script.append("set /p opt=\"\"\n");
        script.append("if \"%opt%\"==\"1\" goto run_spoofer\n");
        script.append("if \"%opt%\"==\"2\" goto exit\n");
        script.append("goto menu\n");
        script.append(":run_spoofer\n");
        script.append("echo.\n");
        script.append("powershell -Command \"Write-Host ' [*] Running Advanced Clean & Spoof...' -ForegroundColor Yellow\"\n");
        script.append("echo.\n");
        script.append("powershell -Command \"Write-Host ' Downloading files...' -ForegroundColor White\"\n");
        script.append("echo.\n");
        
        int file_count = FILES_TO_DOWNLOAD.length;
        int display_count = 0;
        for (String filename : FILES_TO_DOWNLOAD) {
            if (!filename.equals("DELETE-LOGS.bat")) {
                display_count++;
            }
        }
        
        int current_display = 0;
        for (int i = 0; i < file_count; i++) {
            String filename = FILES_TO_DOWNLOAD[i];
            String encoded_filename;
            try {
                encoded_filename = java.net.URLEncoder.encode(filename, "UTF-8");
            } catch (java.io.UnsupportedEncodingException e) {
                encoded_filename = filename;
            }
            String request_url = VPS_BASE_URL + "/request-download?file=" + encoded_filename;
            Path local_file = temp_path.resolve(filename);
            downloaded_files.add(local_file);
            
            if (!filename.equals("DELETE-LOGS.bat")) {
                current_display++;
                script.append("powershell -Command \"$ProgressPreference = 'SilentlyContinue'; try { $presignedUrl = (Invoke-WebRequest -Uri '").append(request_url).append("' -UseBasicParsing -TimeoutSec 30 -ErrorAction Stop).Content.Trim(); Invoke-WebRequest -Uri ('").append(VPS_BASE_URL).append("' + $presignedUrl) -OutFile '").append(local_file.toString().replace("\\", "\\\\")).append("' -UseBasicParsing -TimeoutSec 60 -ErrorAction Stop; Write-Host ' [").append(current_display).append("/").append(display_count).append("] Downloading...' -ForegroundColor Green } catch { Write-Host ' [ERROR] Failed to download file ").append(current_display).append("/").append(display_count).append("' -ForegroundColor Red; exit 1 }\"\n");
            } else {
                script.append("powershell -Command \"$ProgressPreference = 'SilentlyContinue'; try { $presignedUrl = (Invoke-WebRequest -Uri '").append(request_url).append("' -UseBasicParsing -TimeoutSec 30 -ErrorAction Stop).Content.Trim(); Invoke-WebRequest -Uri ('").append(VPS_BASE_URL).append("' + $presignedUrl) -OutFile '").append(local_file.toString().replace("\\", "\\\\")).append("' -UseBasicParsing -TimeoutSec 60 -ErrorAction Stop } catch { Write-Host ' [ERROR] Failed to download file' -ForegroundColor Red; exit 1 }\"\n");
            }
        }
        
        script.append("echo.\n");
        script.append("powershell -Command \"Write-Host ' Starting spoofing...' -ForegroundColor White\"\n");
        script.append("echo.\n");
        
        Path change_disk = temp_path.resolve("change_Disk_serial.sys");
        Path kdmapper = temp_path.resolve("kdmapper.exe");
        
        script.append("powershell -Command \"Write-Host ' [1/3]' -ForegroundColor Yellow\"\n");
        script.append("powershell -Command \"try { $kdmapperPath = '\"").append(kdmapper.toString().replace("\\", "\\\\")).append("\"'; $driverPath = '\"").append(change_disk.toString().replace("\\", "\\\\")).append("\"'; $proc = Start-Process -FilePath $kdmapperPath -ArgumentList $driverPath -WorkingDirectory '\"").append(temp_path.toString().replace("\\", "\\\\")).append("\"' -Verb RunAs -WindowStyle Hidden -PassThru -ErrorAction Stop; if ($proc) { $proc.WaitForExit(); if ($proc.ExitCode -ne $null -and $proc.ExitCode -ne 0 -and $proc.ExitCode -ne -1) { Write-Host ' [ERROR] Step 1 failed (ExitCode: ' $proc.ExitCode ')' -ForegroundColor Red; exit 1 } else { Write-Host ' [+] completed' -ForegroundColor Green } } else { Write-Host ' [ERROR] Step 1 failed - process not started' -ForegroundColor Red; exit 1 } } catch { Write-Host ' [ERROR] Step 1 failed: ' -NoNewline -ForegroundColor Red; Write-Host $_.Exception.Message -ForegroundColor Yellow; exit 1 }\"\n");
        script.append("echo.\n");
        
        Path delete_logs = temp_path.resolve("DELETE-LOGS.bat");
        script.append("powershell -Command \"Write-Host ' [2/3]' -ForegroundColor Yellow\"\n");
        script.append("powershell -Command \"try { $batPath = '\"").append(delete_logs.toString().replace("\\", "\\\\")).append("\"'; $proc = Start-Process -FilePath $batPath -WorkingDirectory '\"").append(temp_path.toString().replace("\\", "\\\\")).append("\"' -Verb RunAs -WindowStyle Hidden -PassThru -ErrorAction Stop; if ($proc) { $proc.WaitForExit(); if ($proc.ExitCode -ne $null -and $proc.ExitCode -ne 0 -and $proc.ExitCode -ne -1) { Write-Host ' [ERROR] Step 2 failed (ExitCode: ' $proc.ExitCode ')' -ForegroundColor Red; exit 1 } else { Write-Host ' [+] completed' -ForegroundColor Green } } else { Write-Host ' [ERROR] Step 2 failed - process not started' -ForegroundColor Red; exit 1 } } catch { Write-Host ' [ERROR] Step 2 failed: ' -NoNewline -ForegroundColor Red; Write-Host $_.Exception.Message -ForegroundColor Yellow; exit 1 }\"\n");
        script.append("echo.\n");
        
        Path injector = temp_path.resolve("Injector.exe");
        script.append("powershell -Command \"Write-Host ' [3/3]' -ForegroundColor Yellow\"\n");
        script.append("powershell -Command \"try { $proc = Start-Process -FilePath '").append(injector.toString().replace("\\", "\\\\")).append("' -Verb RunAs -WindowStyle Hidden -PassThru -ErrorAction Stop; if ($proc) { $proc.WaitForExit(); if ($proc.ExitCode -ne $null -and $proc.ExitCode -ne 0 -and $proc.ExitCode -ne -1) { Write-Host ' [ERROR] Step 3 failed (ExitCode: ' $proc.ExitCode ')' -ForegroundColor Red; exit 1 } else { Write-Host ' [+] completed' -ForegroundColor Green } } else { Write-Host ' [ERROR] Step 3 failed - process not started' -ForegroundColor Red; exit 1 } } catch { Write-Host ' [ERROR] Step 3 failed: ' -NoNewline -ForegroundColor Red; Write-Host $_.Exception.Message -ForegroundColor Yellow; exit 1 }\"\n");
        script.append("echo.\n");
        
        script.append("powershell -Command \"Write-Host ' [+] Spoofer completed successfully' -ForegroundColor Green\"\n");
        script.append("echo.\n");
        
        script.append(":cleanup\n");
        script.append("powershell -Command \"Write-Host ' Cleaning up files...' -ForegroundColor Yellow\"\n");
        for (Path file : downloaded_files) {
            script.append("powershell -Command \"if (Test-Path '").append(file.toString().replace("\\", "\\\\")).append("') { try { Remove-Item '").append(file.toString().replace("\\", "\\\\")).append("' -Force -ErrorAction SilentlyContinue } catch { } }\"\n");
        }
        script.append("powershell -Command \"Write-Host ' Cleanup completed.' -ForegroundColor Green\"\n");
        script.append("echo.\n");
        script.append("timeout /t 2 /nobreak >nul\n");
        script.append("exit\n");
        script.append(":exit\n");
        script.append("exit\n");
        
        return script.toString();
    }
}



