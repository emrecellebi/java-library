/** public final class Long extends Number implements Comparable<Long> **/
BYTES: int static							/// Byte boyutu
MAX_VALUE: long static						/// Maximum long boyutu
MIN_VALUE: long static						/// Minimum long boyutu
SIZE: int static							/// Size boyutu
TYPE: Class<Long> static					/// Sınıf tipi
Long(String)								/// Tring tipinde bir long alır.
Long(long)									/// long tipinde bir değer alır.
bitCount(long): int static					/// Verilen değerin bit sayısını verir.
byteValue(): byte							/// Long değerini byte olarak döner.
compare(long, long): int static				/// Verilen derğerleri bir biri ile karşılaştırır. x == y eşit ise 0 değeri, x < y ise 1 değeri, x > y ise -1 değerini döner.
compareTo(Long): int						/// Verilen derğerleri bir biri ile karşılaştırır. x == y eşit ise 0 değeri, x < y ise 1 değeri, x > y ise -1 değerini döner.
compareUnsigned(long, long): int static		/// Verilen derğerleri bir biri ile karşılaştırır. x == y eşit ise 0 değeri, x < y ise 1 değeri, x > y ise -1 değerini döner.
decode(String): Long static					/// Bir string olarak verilen hex kodu veya desimal değerini longa dönüştürür. 
divideUnsigned(long, long): int static		/// Verilen iki değeri böler.
doubleValue(): double						/// Verilen değeri double olarak döner.
equals(Object): boolean						/// Verilen Long değerini karşılaştırır.
floatValue(): float							/// Verilen değeri float olarak döner.
getLong(String): Long static				/// Tanımlanan Propertyler içerisinde değeri çeker ve Long olarak döner.
getLong(String, Long): Long	static			/// Tanımlı bir Property yo ise default değeri ver.
getLong(String, long): Long	static			/// Tanımlı bir Property yo ise default değeri ver.
hashCode(): int								/// Karma bir değer döner.
hashCode(long): int static					/// Karma bir değer döner.
highestOneBit(long): long static			/// Verilen değerin en yüksek bit değerini döner.
intValue(): int								/// Verilen değeri int olarak döner.
longValue(): long							/// Verilen değeri long olarak döner.
lowestOneBit(long): long static				/// Verilen değerin en düşük bit değerini döner.
max(long, long): long static				/// Verilen iki değerin en büyüğünü döner.
min(long, long): long static				/// Verilen iki değerin en küçüğünü döner.
numberOfLeadingZeros(long): int static		/// Belirtilen uzun değerin ikisinin tümleyen ikili gösteriminde en yüksek sıradaki ("en soldaki") bir bitten önceki sıfır bit sayısını döndürür.
numberOfTrailingZeros(long): int static		/// Belirtilen uzun değerin ikisinin tümleyen ikili gösteriminde en düşük sıradaki ("en sağdaki") bir biti izleyen sıfır bit sayısını döndürür.
parseLong(String): long static				/// String gelen veriyi long tipine dönüştürür.
parseLong(String, int): long static			/// String gelen veriyi verilen tabana göre long tipine dönüştürür. 3 ile 36 tabanları destekler.
parseUnsignedLong(String): long static		/// String gelen veriyi long tipine dönüştürür.
parseUnsignedLong(string, int): long static	/// String gelen veriyi verilen tabana göre long tipine dönüştürür. 3 ile 36 tabanları destekler.
remainderUnsigned(long, long): long static	/// Verilen iki değerin bir biri ile bölümünden kalanı verir.
reverse(long): long static					/// Verilen değerin bitlerin ters çevirerek elde edilen değeri döner.
reverseBytes(long): byte static				/// Verilen değerin byteların sırasını ters çevirerek oluşan değeri döner.
rotateLeft(long, int): long static			/// Verilen değeri verilen değer kadar sola şift eder.
rotateRight(long, int): long static			/// Verilen değeri verilen değer kadar sağa şift eder.
shortValue(): short							/// Verilen değeri short olarak döner.
signum(long): int static					/// Verilen değeri signum olarak döner.
sum(long, long): long static				/// Verilen iki değeri toplar.
toBinaryString(long): String static			/// Verilen değeri binary olarak döner.
toHexString(long): String static			/// Verilen değeri hex olarak döner.
toOctalString(long): String static			/// Verilen değeri Octal olarak döner.
toString(): String							/// Verilen değeri String olarak döner.
toString(long): String static				/// Verilen değeri String olarak döner.
toString(long, int): String static			/// Verilen değeri String olarak döner. Tabanı belirtirsen onu döner
toUnsignedString(long): String static		/// Verilen değeri eksili değeri olmadan döner.
toUnsignedString(long, int): String static	/// Verilen değeri verilen tabana göre eksili değeri olmadan döner.
valueOf(String): Long static				/// Verilen değeri Long nesnesi olarak döner.
valueOf(String, int): Long static			/// Verilen değeri belirtilen tabana göere Long nesnesi olarak döner.
valueOf(long): Long static					/// Verilen değeri Long nesnesi olarak döner.
