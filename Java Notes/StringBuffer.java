/********** StringBuffer Sınıfı **********/
final extends AbstractStringBuilder implements Serializable, CharSequence
///https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html
StringBuffer()
StringBuffer(CharSequence)
StringBuffer(String)
StringBuffer(int)
append(AbstractStringBuilder): StringBuffer protected
append(CharSequence): StringBuffer
append(CharSequence, int, int): StringBuffer
append(Object): StringBuffer
append(String): StringBuffer
append(StringBuffer): StringBuffer
append(boolean): StringBuffer
append(char): StringBuffer
append(char[]): StringBuffer
append(char[], int, int): StringBuffer
append(double): StringBuffer
append(float): StringBuffer
append(int): StringBuffer
append(long): StringBuffer
appendCodePoint(int): StringBuffer
capacity(): int
charAt(int): char
codePointAt(int): int
codePointBefore(int): int
codePointCount(int, int): int
delete(int, int): StringBuffer
deleteCharAt(int): StringBuffer
ensureCapacity(int): void
getChars(int, int, char[], int): void
indexOf(String): int
indexOf(String, int): int
insert(int, CharSequence): StringBuffer
insert(int, CharSequence, int, int): StringBuffer
insert(int, Object): StringBuffer
insert(int, String): StringBuffer
insert(int, boolean): StringBuffer
insert(int, char): StringBuffer
insert(int, char[]): StringBuffer
insert(int, char[], int, int): StringBuffer
insert(int, double): StringBuffer
insert(int, float): StringBuffer
insert(int, int): StringBuffer
insert(int, long): StringBuffer
lastIndexOf(String): int
lastIndexOf(String, int): int
length(): int
offsetByCodePoints(int, int): int
replace(int, int, String): StringBuffer
reverse(): StringBuffer
setCharAt(int, char): void
setLength(int): void
subSequence(int, int): CharSequence
substring(int): String
substring(int, int): String
toString(): String