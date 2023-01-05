/********** AbstractStringBuilder Sınıfı **********/
/// https://docs.oracle.com/javase/8/docs/api/java/lang/AbstractStringBuilder.html
abstract class AbstractStringBuilder implements Appendable, CharSequence /// Public olmaya bir class
append(AbstractStringBuilder): AbstractStringBuilder protected
append(CharSequence): AbstractStringBuilder
append(CharSequence, int, int): AbstractStringBuilder
append(Object): AbstractStringBuilder
append(String): AbstractStringBuilder
append(StringBuffer): AbstractStringBuilder
append(boolean): AbstractStringBuilder
append(char): AbstractStringBuilder
append(char[]): AbstractStringBuilder
append(char[], int, int): AbstractStringBuilder
append(double): AbstractStringBuilder
append(float): AbstractStringBuilder
append(int): AbstractStringBuilder
append(long): AbstractStringBuilder
appendCodePoint(int): AbstractStringBuilder
capacity(): int
charAt(int): char
codePointAt(int): int
codePointBefore(int): int
codePointCount(int, int): int
delete(int, int): AbstractStringBuilder
deleteCharAt(int): AbstractStringBuilder
ensureCapacity(int): void
getChars(int, int, char[], int): void
indexOf(String): int
indexOf(String, int): int
insert(int, CharSequence): AbstractStringBuilder
insert(int, CharSequence, int, int): AbstractStringBuilder
insert(int, Object): AbstractStringBuilder
insert(int, String): AbstractStringBuilder
insert(int, boolean): AbstractStringBuilder
insert(int, char): AbstractStringBuilder
insert(int, char[]): AbstractStringBuilder
insert(int, char[], int, int): AbstractStringBuilder
insert(int, double): AbstractStringBuilder
insert(int, float): AbstractStringBuilder
insert(int, int): AbstractStringBuilder
insert(int, long): AbstractStringBuilder
lastIndexOf(String): int
lastIndexOf(String, int): int
length(): int
offsetByCodePoints(int, int): int
replace(int, int, String): AbstractStringBuilder
reverse(): AbstractStringBuilder
setCharAt(int, char): void
setLength(int): void
subSequence(int, int): CharSequence
substring(int): String
substring(int, int): String
toString(): String abstract
trimToSize(): void