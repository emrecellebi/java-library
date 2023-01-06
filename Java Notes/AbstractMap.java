/** public abstract class AbstractMap<K, V> implements Map<K, V> **/
// https://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.html
	/** public static class SimpleEntry<K, V> implements Map.Entry<K, V>, Serializable **/
	SimpleEntry(Map.Entry<? extends K, ? extends V>)				/// Map Entry tipinde bir nesneye oluşturur.
	SimpleEntry(K, V)												/// Key ve Value ile bir nesne oluşturur.
	equals(Object): boolean											/// Map ini bir eşşitlik kontrolü sağlar.
	getKey(): K														/// Map içinden key değerini getir.
	getValue(): V													/// Map içinden value değerini getir.
	hashCode(): int													/// Map için bir hash kode üretir
	setValue(V): V													/// Map için value değerini değiştir. Geri dönüş olarak eski değeri verir.
	toString(): String												/// Map bir String olarak döner.
	/** public static class SimpleImmutableEntry<K, V> implements Map.Entry<K, V>, Serializable **/
	SimpleImmutableEntry(Map.Entry<? extends K, ? extends V>)		/// Map Entry tipinde bir nesneye oluşturur.
	SimpleImmutableEntry(K, V)										/// Key ve Value ile bir nesne oluşturur.
	equals(Object): boolean											/// Map ini bir eşşitlik kontrolü sağlar.
	getKey(): K														/// Map içinden key değerini getir.
	getValue(): V													/// Map içinden value değerini getir.
	hashCode(): int													/// Map için bir hash kode üretir
	setValue(V): V													/// Map için value değerini değiştir. Geri dönüş olarak eski değeri verir. Ancak bu sınıfda bu Method kullanılmamışdır. Exception dönderir.
	toString(): String												/// Map bir String olarak döner.
clear(): void														/// Map üzerindeki tüm eşleşmeşleri kaldir.
clone(): Object protected											/// Map bir kopyasını dönderir.
containsKey(Object): boolean										/// Map içindeki key ile eşleşme var ise true döner.
containsValue(Object): boolean										/// Map içindeki value ile eşleşme var ise true döner.
entrySet(): Set<Map.Entry<K, V>> abstract							/// Map içindekilerinin bir Set<Map.Entry<K,V>> olarak döner.
equals(Object): boolean												/// Map içerisin deki belitilen nesneye eşşitlik kontrolü yapar
get(Object): V														/// Map içinde belirtilen Key değerinin Value değerini verir.
hashCode(): int														/// Map için bir hash kode değeri döner
isEmpty(): boolean 													/// Map içeriği boş ise true olarak döner.
put(K, V): V														/// Map içeriğine key ve Value değeri ekler.
putAll(Map<? extends K, ? extends V>): void 						/// Map içeriğine ikinci bir Map tipinde listeyi alır.
remove(Object): V 													/// Map içeriğinden belirtilen Key değerini kaldırır.
size(): int 														/// Map listesinin boyutunu döner.
toString(): String													/// Map bir String olarak döner.
values(): Collection<V>												/// Map içindeki Value değerlerini döner.