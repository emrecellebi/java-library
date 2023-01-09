// https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html
/** public final class Files **/
exists(Path, LinkOption...): boolean static						/// Bir dosyanın var olup olmadığını kontrol eder. Dosya varsa true dosya yok ise false;
isRegularFile(Path, LinkOption...): boolean static				/// Normal bir dosya olup olmadığını kontrol eder. Dosya normal dosya ise true, Dosya yok veya normal bir dosya değil ise false döner.
