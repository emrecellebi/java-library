/********** System Sınıfı **********/
/// https://docs.oracle.com/javase/8/docs/api/java/lang/System.html
public final class System
err: PrintStream static
in: InputStream static
out: PrintStream static
arraycopy(Object, int, Object, int, int): void static native
clearProperty(String): String static
console(): Console static
currentTimeMillis(): long static native
exit(int): void static
gc(): void static
getProperties(): Properties static
getProperty(String): String static
getSecurityManager(): SecurityManager static
getenv(): Map static
getenv(String): String static
identityHashCode(Object): int static native
inheritedChannel(): Channel throws IOException
lineSeparator(): String static
load(String): void static
loadLibrary(String): void static
mapLibraryName(String): String static native
nanoTime(): long static native								/// Çalışan Java Sanal Makinesi'nin yüksek çözünürlüklü zaman kaynağının geçerli değerini nanosaniye cinsinden döndürür.
setProperty(String, String): String static
runFinalization(): void static
runFinalizersOnExit(boolean): void static
setErr(PrintStream): void static
setIn(InputStream): void static
setOut(PrintStream): void static
setProperties(Properties): void static
setSecurityManager(SecurityManager): void static