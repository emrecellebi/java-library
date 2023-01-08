// https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
// https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html
/** public interface Map<K, V> **/
	/** public static interface Entry<K, V> **/
	comparingByKey(): Comparator<Entry<K, V>> static
	comparingByKey(Comparator<? super K>): Comparator<Entry<K, V>> static
	comparingByValue(): Comparator<Entry<K, V>> static
	comparingByValue(Comparator<? super V>): Comparator<Entry<K, V>> static
	equals(Object): boolean abstract									/// Map ini bir eşşitlik kontrolü sağlar.
	getKey(): K abstract												/// Map içinden key değerini getir.
	getValue(): V abstract												/// Map içinden value değerini getir.
	hashCode(): int abstract											/// Map için bir hash kode üretir
	setValue(V): V abstract												/// Map için value değerini değiştir. Geri dönüş olarak eski değeri verir.
clear(): void abstract												/// Map üzerindeki tüm eşleşmeşleri kaldir.
compute(K, BiFunction<? super K, ? super V, ? extends V>): V default/// Map hesaplamalar.
computeIfAbsent(K, Function<? super K, ? extends V>): V default		/// Map hesaplamalar.
computeIfPresent(K, BiFunction<? super K, ? super V, ? extends V>): V default /// Map hesaplamalar.
containsKey(Object): boolean abstract								/// Map içindeki key ile eşleşme var ise true döner.
containsValue(Object): boolean abstract								/// Map içindeki value ile eşleşme var ise true döner.
entrySet(): Set<Map.Entry<K, V>>									/// Map içindekilerinin bir Set<Map.Entry<K,V>> olarak döner.
equals(Object): boolean	abstract									/// Map içerisin deki belitilen nesneye eşşitlik kontrolü yapar
forEach(BiConsumer<? super K, ? super V>): void default				/// Tüm ögeler işlene kadar verilen eylemi gerçekleştirir.
get(Object): V abstract												/// Map içinde belirtilen Key değerinin Value değerini verir.
getOrDefault(Object, V): V default									/// Map içerisinde belirtilen Key değerinin Value değerini döner. Belirtilen key değeri yok ise verilen defaultValue değerini döner.
hashCode(): int	abstract											/// Map için bir hash kode değeri döner
isEmpty(): boolean abstract											/// Map içeriği boş ise true olarak döner.
keySet(): Set<K> abstract											/// Map içeriğinde Key değerlerini döner.
merge(K, V, BiFunction<? super V, ? super V, ? extends V>): V default/// Map içerisinde belirtilen Key ve Value değeri yok ise yeni bir değer olarak ekler. Key değeri var ise value değerini değiştirir.
put(K, V): V abstract												/// Map içeriğine key ve Value değeri ekler.
putAll(Map<? extends K, ? extends V>): void abstract				/// Map içeriğine ikinci bir Map tipinde listeyi alır.
putIfAbsent(K, V): V default										/// Map içerisinde Belitilen Key değeri var ise onun değerini döner. Yok ise belitilen Value ile eşletirir. dönüş olarak null döner.
remove(Object): V abstract											/// Map içeriğinden belirtilen Key değerini kaldırır.
remove(Object, Object): boolean default								/// Map içeriğinden belirtilen Key ve Value değerleri eşit ise onu kaldırır dönüş olarak ise true döner.
replace(K, V): V default											/// Map içerisinde belitilen Key var ise Belitilen Value ile değiştir. dönüş olarak ise Value değerini döner. Key yok ise Value değeri null olarak döner.
replace(K, V, V): boolean default									/// Map içerisinde belirtilen Key ve Value değeri var ise Value ile değiştir. dönüş olarak da true döner.
replaceAll(BiFunction<? super K, ? super V, ? extends V>): void default /// Map içeriğinde belirtilen Key ve Value değerlerini toplu değiştirir.
size(): int abstract												/// Map listesinin boyutunu döner.
values(): Collection<V> abstract									/// Map içindeki Value değerlerini döner.



