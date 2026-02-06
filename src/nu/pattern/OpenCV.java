/*     */ package nu.pattern;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.lang.reflect.Field;
/*     */ import java.nio.file.FileVisitResult;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.SimpleFileVisitor;
/*     */ import java.nio.file.attribute.BasicFileAttributes;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import java.util.regex.Pattern;
/*     */ import org.opencv.core.Core;
/*     */ 
/*     */ 
/*     */ public class OpenCV
/*     */ {
/*  25 */   private static final Logger logger = Logger.getLogger(OpenCV.class.getName());
/*     */ 
/*     */   
/*     */   enum OS
/*     */   {
/*  30 */     OSX((String)new String[] { "^[Mm]ac OS X$" }),
/*  31 */     LINUX((String)new String[] { "^[Ll]inux$" }),
/*  32 */     WINDOWS((String)new String[] { "^[Ww]indows.*" });
/*     */     
/*     */     private final Set<Pattern> patterns;
/*     */     
/*     */     OS(String... patterns) {
/*  37 */       this.patterns = new HashSet<>();
/*     */       
/*  39 */       for (String pattern : patterns) {
/*  40 */         this.patterns.add(Pattern.compile(pattern));
/*     */       }
/*     */     }
/*     */     
/*     */     private boolean is(String id) {
/*  45 */       for (Pattern pattern : this.patterns) {
/*  46 */         if (pattern.matcher(id).matches()) {
/*  47 */           return true;
/*     */         }
/*     */       } 
/*  50 */       return false;
/*     */     }
/*     */     
/*     */     public static OS getCurrent() {
/*  54 */       String osName = System.getProperty("os.name");
/*     */       
/*  56 */       for (OS os : values()) {
/*  57 */         if (os.is(osName)) {
/*  58 */           OpenCV.logger.log(Level.FINEST, "Current environment matches operating system descriptor \"{0}\".", os);
/*  59 */           return os;
/*     */         } 
/*     */       } 
/*     */       
/*  63 */       throw new UnsupportedOperationException(String.format("Operating system \"%s\" is not supported.", new Object[] { osName }));
/*     */     }
/*     */   }
/*     */   
/*     */   enum Arch {
/*  68 */     X86_32((String)new String[] { "i386", "i686", "x86" }),
/*  69 */     X86_64((String)new String[] { "amd64", "x86_64" }),
/*  70 */     ARMv7((String)new String[] { "arm" }),
/*  71 */     ARMv8((String)new String[] { "aarch64", "arm64" });
/*     */     
/*     */     private final Set<String> patterns;
/*     */     
/*     */     Arch(String... patterns) {
/*  76 */       this.patterns = new HashSet<>(Arrays.asList(patterns));
/*     */     }
/*     */     
/*     */     private boolean is(String id) {
/*  80 */       return this.patterns.contains(id);
/*     */     }
/*     */     
/*     */     public static Arch getCurrent() {
/*  84 */       String osArch = System.getProperty("os.arch");
/*     */       
/*  86 */       for (Arch arch : values()) {
/*  87 */         if (arch.is(osArch)) {
/*  88 */           OpenCV.logger.log(Level.FINEST, "Current environment matches architecture descriptor \"{0}\".", arch);
/*  89 */           return arch;
/*     */         } 
/*     */       } 
/*     */       
/*  93 */       throw new UnsupportedOperationException(String.format("Architecture \"%s\" is not supported.", new Object[] { osArch }));
/*     */     }
/*     */   }
/*     */   
/*     */   private static class UnsupportedPlatformException extends RuntimeException {
/*     */     private UnsupportedPlatformException(OpenCV.OS os, OpenCV.Arch arch) {
/*  99 */       super(String.format("Operating system \"%s\" and architecture \"%s\" are not supported.", new Object[] { os, arch }));
/*     */     }
/*     */   }
/*     */   
/*     */   private static class TemporaryDirectory {
/*     */     static final String OPENCV_PREFIX = "opencv_openpnp";
/*     */     final Path path;
/*     */     
/*     */     public TemporaryDirectory() {
/*     */       try {
/* 109 */         this.path = Files.createTempDirectory("opencv_openpnp", (FileAttribute<?>[])new FileAttribute[0]);
/* 110 */       } catch (IOException e) {
/* 111 */         throw new RuntimeException(e);
/*     */       } 
/*     */     }
/*     */     
/*     */     public Path getPath() {
/* 116 */       return this.path;
/*     */     }
/*     */     
/*     */     public TemporaryDirectory deleteOldInstancesOnStart() {
/* 120 */       Path tempDirectory = this.path.getParent();
/*     */       
/* 122 */       for (File file : tempDirectory.toFile().listFiles()) {
/* 123 */         if (file.isDirectory() && file.getName().startsWith("opencv_openpnp")) {
/*     */           try {
/* 125 */             delete(file.toPath());
/* 126 */           } catch (RuntimeException e) {
/* 127 */             if (e.getCause() instanceof java.nio.file.AccessDeniedException) {
/* 128 */               OpenCV.logger.fine("Failed delete a previous instance of the OpenCV binaries, likely in use by another program: ");
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 135 */       return this;
/*     */     }
/*     */     
/*     */     public TemporaryDirectory markDeleteOnExit() {
/* 139 */       Runtime.getRuntime().addShutdownHook(new Thread()
/*     */           {
/*     */             public void run() {
/* 142 */               OpenCV.TemporaryDirectory.this.delete();
/*     */             }
/*     */           });
/*     */       
/* 146 */       return this;
/*     */     }
/*     */     
/*     */     private void delete(Path path) {
/* 150 */       if (!Files.exists(path, new java.nio.file.LinkOption[0])) {
/*     */         return;
/*     */       }
/*     */       
/*     */       try {
/* 155 */         Files.walkFileTree(path, new SimpleFileVisitor<Path>()
/*     */             {
/*     */               public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
/* 158 */                 Files.deleteIfExists(dir);
/* 159 */                 return super.postVisitDirectory(dir, e);
/*     */               }
/*     */ 
/*     */ 
/*     */               
/*     */               public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
/* 165 */                 Files.deleteIfExists(file);
/* 166 */                 return super.visitFile(file, attrs);
/*     */               }
/*     */             });
/* 169 */       } catch (IOException e) {
/* 170 */         throw new RuntimeException(e);
/*     */       } 
/*     */     }
/*     */     
/*     */     public void delete() {
/* 175 */       delete(this.path);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void loadShared() {
/* 183 */     SharedLoader.getInstance();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static class SharedLoader
/*     */   {
/* 191 */     private static final List<String> errorMessages = Arrays.asList(new String[] {
/* 192 */           String.format("no %s in java.library.path", new Object[] { Core.NATIVE_LIBRARY_NAME
/* 193 */             }), String.format("%s (Not found in java.library.path)", new Object[] { Core.NATIVE_LIBRARY_NAME })
/*     */         });
/*     */     
/*     */     private Path libraryPath;
/*     */     
/*     */     private SharedLoader() {
/*     */       try {
/* 200 */         System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
/* 201 */         OpenCV.logger.log(Level.FINEST, "Loaded existing OpenCV library \"{0}\" from library path.", Core.NATIVE_LIBRARY_NAME);
/* 202 */       } catch (UnsatisfiedLinkError ule) {
/*     */ 
/*     */         
/* 205 */         if (ule == null || !openCVNotFoundInJavaLibraryPath(ule.getMessage())) {
/* 206 */           OpenCV.logger.log(Level.FINEST, String.format("Encountered unexpected loading error.", new Object[0]), ule);
/* 207 */           throw ule;
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 215 */         if (Double.parseDouble(System.getProperty("java.specification.version")) >= 12.0D) {
/* 216 */           OpenCV.logger.log(Level.SEVERE, "OpenCV.loadShared() is not supported in Java >= 12. Falling back to OpenCV.loadLocally().");
/* 217 */           OpenCV.loadLocally();
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/* 222 */         this.libraryPath = OpenCV.extractNativeBinary();
/*     */         
/* 224 */         addLibraryPath(this.libraryPath.getParent());
/* 225 */         System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
/*     */         
/* 227 */         OpenCV.logger.log(Level.FINEST, "OpenCV library \"{0}\" loaded from extracted copy at \"{1}\".", new Object[] { Core.NATIVE_LIBRARY_NAME, System.mapLibraryName(Core.NATIVE_LIBRARY_NAME) });
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private boolean openCVNotFoundInJavaLibraryPath(String errorMessage) {
/* 237 */       for (String errorFragment : errorMessages) {
/* 238 */         if (errorMessage.contains(errorFragment)) {
/* 239 */           return true;
/*     */         }
/*     */       } 
/*     */       
/* 243 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected void finalize() throws Throwable {
/* 251 */       super.finalize();
/*     */       
/* 253 */       if (null == this.libraryPath) {
/*     */         return;
/*     */       }
/*     */       
/* 257 */       removeLibraryPath(this.libraryPath.getParent());
/*     */     }
/*     */     
/*     */     private static class Holder {
/* 261 */       private static final OpenCV.SharedLoader INSTANCE = new OpenCV.SharedLoader();
/*     */     }
/*     */     
/*     */     public static SharedLoader getInstance() {
/* 265 */       return Holder.INSTANCE;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static void addLibraryPath(Path path) {
/* 274 */       String normalizedPath = path.normalize().toString();
/*     */       
/*     */       try {
/* 277 */         Field field = ClassLoader.class.getDeclaredField("usr_paths");
/* 278 */         field.setAccessible(true);
/*     */         
/* 280 */         Set<String> userPaths = new HashSet<>(Arrays.asList((String[])field.get(null)));
/* 281 */         userPaths.add(normalizedPath);
/*     */         
/* 283 */         field.set(null, userPaths.toArray(new String[userPaths.size()]));
/*     */         
/* 285 */         System.setProperty("java.library.path", System.getProperty("java.library.path") + File.pathSeparator + normalizedPath);
/*     */         
/* 287 */         OpenCV.logger.log(Level.FINEST, "System library path now \"{0}\".", System.getProperty("java.library.path"));
/* 288 */       } catch (IllegalAccessException e) {
/* 289 */         throw new RuntimeException("Failed to get permissions to set library path");
/* 290 */       } catch (NoSuchFieldException e) {
/* 291 */         throw new RuntimeException("Failed to get field handle to set library path");
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static void removeLibraryPath(Path path) {
/* 299 */       String normalizedPath = path.normalize().toString();
/*     */       
/*     */       try {
/* 302 */         Field field = ClassLoader.class.getDeclaredField("usr_paths");
/* 303 */         field.setAccessible(true);
/*     */         
/* 305 */         Set<String> userPaths = new HashSet<>(Arrays.asList((String[])field.get(null)));
/* 306 */         userPaths.remove(normalizedPath);
/*     */         
/* 308 */         field.set(null, userPaths.toArray(new String[userPaths.size()]));
/*     */         
/* 310 */         System.setProperty("java.library.path", System.getProperty("java.library.path").replace(File.pathSeparator + path.normalize().toString(), ""));
/* 311 */       } catch (IllegalAccessException e) {
/* 312 */         throw new RuntimeException("Failed to get permissions to set library path");
/* 313 */       } catch (NoSuchFieldException e) {
/* 314 */         throw new RuntimeException("Failed to get field handle to set library path");
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void loadLocally() {
/* 323 */     LocalLoader.getInstance();
/*     */   }
/*     */   
/*     */   private static class LocalLoader
/*     */   {
/*     */     private LocalLoader() {
/* 329 */       Path libraryPath = OpenCV.extractNativeBinary();
/* 330 */       System.load(libraryPath.normalize().toString());
/*     */       
/* 332 */       OpenCV.logger.log(Level.FINEST, "OpenCV library \"{0}\" loaded from extracted copy at \"{1}\".", new Object[] { Core.NATIVE_LIBRARY_NAME, System.mapLibraryName(Core.NATIVE_LIBRARY_NAME) });
/*     */     }
/*     */     
/*     */     private static class Holder {
/* 336 */       private static final OpenCV.LocalLoader INSTANCE = new OpenCV.LocalLoader();
/*     */     }
/*     */     
/*     */     public static LocalLoader getInstance() {
/* 340 */       return Holder.INSTANCE;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Path extractNativeBinary() {
/* 348 */     OS os = OS.getCurrent();
/* 349 */     Arch arch = Arch.getCurrent();
/* 350 */     return extractNativeBinary(os, arch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Path extractNativeBinary(OS os, Arch arch) {
/*     */     String location;
/*     */     Path destination;
/* 359 */     switch (os) {
/*     */       case LINUX:
/* 361 */         switch (arch) {
/*     */           case LINUX:
/* 363 */             location = "/nu/pattern/opencv/linux/x86_64/libopencv_java490.so";
/*     */             break;
/*     */           case OSX:
/* 366 */             location = "/nu/pattern/opencv/linux/ARMv7/libopencv_java490.so";
/*     */             break;
/*     */           case WINDOWS:
/* 369 */             location = "/nu/pattern/opencv/linux/ARMv8/libopencv_java490.so";
/*     */             break;
/*     */         } 
/* 372 */         throw new UnsupportedPlatformException(os, arch);
/*     */ 
/*     */       
/*     */       case OSX:
/* 376 */         switch (arch) {
/*     */           case LINUX:
/* 378 */             location = "/nu/pattern/opencv/osx/x86_64/libopencv_java490.dylib";
/*     */             break;
/*     */           case WINDOWS:
/* 381 */             location = "/nu/pattern/opencv/osx/ARMv8/libopencv_java490.dylib";
/*     */             break;
/*     */         } 
/* 384 */         throw new UnsupportedPlatformException(os, arch);
/*     */ 
/*     */       
/*     */       case WINDOWS:
/* 388 */         switch (arch) {
/*     */           case null:
/* 390 */             location = "/nu/pattern/opencv/windows/x86_32/opencv_java490.dll";
/*     */             break;
/*     */           case LINUX:
/* 393 */             location = "/nu/pattern/opencv/windows/x86_64/opencv_java490.dll";
/*     */             break;
/*     */         } 
/* 396 */         throw new UnsupportedPlatformException(os, arch);
/*     */ 
/*     */       
/*     */       default:
/* 400 */         throw new UnsupportedPlatformException(os, arch);
/*     */     } 
/*     */     
/* 403 */     logger.log(Level.FINEST, "Selected native binary \"{0}\".", location);
/*     */     
/* 405 */     InputStream binary = OpenCV.class.getResourceAsStream(location);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 412 */     if (OS.WINDOWS.equals(os)) {
/* 413 */       destination = (new TemporaryDirectory()).deleteOldInstancesOnStart().getPath().resolve("./" + location).normalize();
/*     */     } else {
/* 415 */       destination = (new TemporaryDirectory()).markDeleteOnExit().getPath().resolve("./" + location).normalize();
/*     */     } 
/*     */     
/*     */     try {
/* 419 */       logger.log(Level.FINEST, "Copying native binary to \"{0}\".", destination);
/* 420 */       Files.createDirectories(destination.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 421 */       Files.copy(binary, destination, new java.nio.file.CopyOption[0]);
/* 422 */       binary.close();
/* 423 */     } catch (IOException ioe) {
/* 424 */       throw new IllegalStateException(String.format("Error writing native library to \"%s\".", new Object[] { destination }), ioe);
/*     */     } 
/*     */     
/* 427 */     logger.log(Level.FINEST, "Extracted native binary to \"{0}\".", destination);
/*     */     
/* 429 */     return destination;
/*     */   }
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\nu\pattern\OpenCV.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */