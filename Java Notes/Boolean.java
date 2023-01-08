// https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html
/** public final class Boolean implements Serializable, Comparable<Boolean> **/
FALSE: Boolean static							/// Boolean nesenesi olarak false döner.
TRUE: Boolean static		 					/// Boolean nesenesi olarak true döner.
TYPE: Class<Boolean> static						/// Boolean Class tipi döner.
Boolean(String)									/// String olarak bir Boolean nesenesi oluşturur.
Boolean(boolean)								/// boolean olarak bir Boolean nesenesi oluşturur.
booleanValue(): boolean							/// Boolean nesenesi içindeki boolean değerini döner.
compare(boolean, boolean): int static			/// İki boolean değerinin karşlaştırır. x == y ise 0, x doğru ise 1 değil ise -1
compareTo(Boolean): int							/// Boolean nesesini karşlaştırır. x == y ise 0, x doğru ise 1 değil ise -1
equals(Object): boolean							/// Boolean nesenesi ile karşılaştırır.
getBoolean(String): boolean static				/// Propertylerden boolean değerini döner.
hashCode(): int									/// Karma kode döner.
hashCode(boolean): int static					/// Karma kode döner.
logicalAnd(boolean, boolean): boolean static	/// &&
logicalOr(boolean, boolean): boolean static		/// ||
logicalXor(boolean, boolean): boolean static	/// ^
parseBoolean(String): boolean static			/// String değeri boolean tipine dönüştür.
toString(): String								/// Boolean nesenesini String olarak döner.
toString(boolean): String static				/// boolean değerini String olarak döner.
valueOf(String): Boolean static					/// String değerini Boolean nesenesi olarak döner.
valueOf(boolean): Boolean static				/// boolean değerini Boolean nesenesi olarak döner.
