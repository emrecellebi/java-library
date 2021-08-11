/********** String Sınıfı **********/
final extends Object implements Serializable, Comparable<String>, CharSequence
///https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
class CaseInsensitiveComparator
CASE_INSENSITIVE_ORDER: Comparator static final
String();
String(String);
String(StringBuffer);
String(StringBuilder);
String(byte[]);
String(byte[], Charset);
String(byte[], String);
String(byte[], int);
String(byte[], int, int);
String(byte[], int, int, Charset);
String(byte[], int, int, String);
String(byte[], int, int, int);
String(char[]);
String(char[], boolean); protected
String(char[], int, int);
String(int[], int, int);
charAt(int): char
codePointAt(int): int
codePointBefore(int): int
codePointCount(int, int): int
compareTo(String): int
compareToIgnoreCase(String): int
concat(String): String
contains(CharSequence): boolean
contentEquals(CharSequence): boolean
contentEquals(StringBuffer): boolean
copyValueOf(char[]): String static
copyValueOf(char[], int, int): String static
endsWith(String): boolean
equals(Object): boolean
equalsIgnoreCase(String): boolean
format(Locale, String, Object...): String static
format(String, Object...):String static
getBytes():byte[]
getBytes(Charset):byte[]
getBytes(String):byte[]
getBytes(int, int, byte[], int): void
getChars(char[], int): void protected
getChars(int, int, char[], int): void
hashCode(): int
indexOf(String): int
indexOf(String, int): int
indexOf(char[], int, int, String, int): int static protected
indexOf(char[], int, int, char[], int, int, int): int static protected
indexOf(int): int
indexOf(int, int): int
intern(): String
isEmpty(): boolean
join(CharSequence, CharSequence...): String
join(CharSequence, Iterable): String
lastIndexOf(String): int
lastIndexOf(String, int): int
lastIndexOf(char[], int, int, String, int): int static protected
lastIndexOf(char[], int, int, char[], int, int, int): int static protected
lastIndexOf(int): int
lastIndexOf(int, int): int
length(): int
matches(String): boolean
offsetByCodePoints(int, int): int
regionMatches(boolean, int, String, int, int): boolean
regionMatches(int, String, int, int): boolean
replace(CharSequence, CharSequence): String
replace(char, char):String			
replaceAll(String, String): String	
replaceFirst(String, String): String	
split(String): String[]
split(String, int): String[]
startsWith(String): boolean
startsWith(String, int): boolean
subSequence(int, int): CharSequence
substring(int): String
substring(int, int): String
toCharArray(): char[]
toLowerCase(): String
toLowerCase(Locale): String
toString(): String					
toUpperCase(): String
toUpperCase(Locale): String
trim(): String
valueOf(Object): String static
valueOf(boolean): String static
valueOf(char): String static
valueOf(char[]): String static
valueOf(char[], int, int): String static
valueOf(double): String static
valueOf(float): String static
valueOf(int): String static
valueOf(long): String static