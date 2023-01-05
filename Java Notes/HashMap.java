/** public class HashMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable **/
// https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
HashMap()															/// Varsayılan başlangıç ​​kapasitesi (16) ve varsayılan yük faktörü (0,75) ile boş bir HashMap oluşturur.
HashMap(Map<? extends K, ? extends V>)								/// Belirtilen Harita ile aynı eşlemelere sahip yeni bir HashMap oluşturur.
HashMap(int)														/// Belirtilen başlangıç ​​kapasitesi ve varsayılan yük faktörü (0,75) ile boş bir HashMap oluşturur.
HashMap(int, float)													/// Belirtilen başlangıç ​​kapasitesi ve yük faktörü ile boş bir HashMap oluşturur.
clear(): void														/// Map üzerindeki tüm eşleşmeşleri kaldir.
clone(): Object														/// Map bir kopyasını dönderir.
compute(K, BiFunction<? super K, ? super V, ? extends V>): V		/// Map verilen şarta göre karşılaştırma yapar.
computeIfAbsent(K, Function<? super K, ? extends V>): V				/// Map verilen şarta göre karşılaştırma yapar.
computeIfPresent(K, BiFunction<? super K, ? super V, ? extends V>): V /// Map verilen şarta göre karşılaştırma yapar.
containsKey(Object): boolean										/// Map içindeki key ile eşleşme var ise true döner.
containsValue(Object): boolean										/// Map içindeki value ile eşleşme var ise true döner.
forEach(BiConsumer<? super K, ? super V>): void						/// Tüm ögeler işlene kadar verilen eylemi gerçekleştirir.
get(Object): V														/// Map içinde belirtilen Key değerinin Value değerini verir.
getOrDefault(Object, V): V											/// Map içerisinde belirtilen Key değerinin Value değerini döner. Belirtilen key değeri yok ise verilen defaultValue değerini döner.
isEmpty(): boolean 													/// Map içeriği boş ise true olarak döner.
keySet(): Set<K>													/// Map içeriğinde Key değerlerini döner.
merge(K, V, BiFunction<? super V, ? super V, ? extends V>): V		/// Map içerisinde belirtilen Key ve Value değeri yok ise yeni bir değer olarak ekler. Key değeri var ise value değerini değiştirir.
put(K, V): V														/// Map içeriğine key ve Value değeri ekler.
putAll(Map<? extends K, ? extends V>): void 						/// Map içeriğine ikinci bir Map tipinde listeyi alır.
putIfAbsent(K, V): V 												/// Map içerisinde Belitilen Key değeri var ise onun değerini döner. Yok ise belitilen Value ile eşletirir. dönüş olarak null döner.
remove(Object): V 													/// Map içeriğinden belirtilen Key değerini kaldırır.
remove(Object, Object): boolean										/// Map içeriğinden belirtilen Key ve Value değerleri eşit ise onu kaldırır dönüş olarak ise true döner.
replace(K, V): V													/// Map içerisinde belitilen Key var ise Belitilen Value ile değiştir. dönüş olarak ise Value değerini döner. Key yok ise Value değeri null olarak döner.
replace(K, V, V): boolean											/// Map içerisinde belirtilen Key ve Value değeri var ise Value ile değiştir. dönüş olarak da true döner.
replaceAll(BiFunction<? super K, ? super V, ? extends V>): void		/// Map içeriğinde belirtilen Key ve Value değerlerini toplu değiştirir.
size(): int															/// Map listesinin boyutunu döner.
values(): Collection<V>												/// Map içindeki Value değerlerini döner.