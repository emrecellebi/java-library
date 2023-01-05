/** public class LinkedHashMap<K, V> extends HashMap<K, V> implements Map<K, V> **/
// https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html
LinkedHashMap()														/// Varsayılan başlangıç ​​kapasitesi (16) ve yük faktörü (0,75) ile boş bir ekleme siparişli LinkedHashMap örneği oluşturur.
LinkedHashMap(Map<? extends K, ? extends V>)						/// Belirtilen eşlemeyle aynı eşlemelere sahip, ekleme sıralı bir LinkedHashMap örneği oluşturur.
LinkedHashMap(int)													/// Belirtilen başlangıç ​​kapasitesine ve varsayılan yük faktörüne (0,75) sahip boş bir ekleme siparişli LinkedHashMap örneği oluşturur.
LinkedHashMap(int, float)											/// Belirtilen başlangıç ​​kapasitesi ve yük faktörü ile boş bir ekleme siparişli LinkedHashMap örneği oluşturur.
LinkedHashMap(int, float, boolean)									/// Belirtilen başlangıç ​​kapasitesi, yük faktörü ve sipariş modu ile boş bir LinkedHashMap örneği oluşturur.
clear(): void														/// Map üzerindeki tüm eşleşmeşleri kaldir.
containsValue(Object): boolean										/// Map içindeki value ile eşleşme var ise true döner.
entrySet(): Set<Map.Entry<K, V>>									/// Map içindekilerinin bir Set<Entry<K,V>> olarak döner.
forEach(BiConsumer<? super K, ? super V>) void						/// 
get(Object): V														/// Map içinde belirtilen Key değerinin Value değerini verir.
getOrDefault(Object, V): V											/// Map içerisinde belirtilen Key değerinin Value değerini döner. Belirtilen key değeri yok ise verilen defaultValue değerini döner.
keySet(): Set<K>													/// Map içeriğinde Key değerlerini döner.
replaceAll(BiFunction<? super K, ? super V, ? extends V>): void		/// Map içeriğinde belirtilen Key ve Value değerlerini toplu değiştirir.
values(): Collection<V>												/// Map içindeki Value değerlerini döner.
removeEldestEntry(Map.Entry<K, V>): boolean protected				/// Tanımlanan Sart gerçeklşir ise Map içerisindekileri siler.
