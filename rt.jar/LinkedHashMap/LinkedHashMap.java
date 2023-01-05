package com.emrecellebi;

import java.util.LinkedHashMap;
import java.util.Map;

public class Console
{
	public static void main(String[] args)
	{
		new LinkedHashMap<String, String>();						/// Varsayılan başlangıç ​​kapasitesi (16) ve yük faktörü (0,75) ile boş bir ekleme siparişli LinkedHashMap örneği oluşturur.
		new LinkedHashMap<String, String>(Map<K, V>);				/// Belirtilen eşlemeyle aynı eşlemelere sahip, ekleme sıralı bir LinkedHashMap örneği oluşturur.
		new LinkedHashMap<String, String>(int);						/// Belirtilen başlangıç ​​kapasitesine ve varsayılan yük faktörüne (0,75) sahip boş bir ekleme siparişli LinkedHashMap örneği oluşturur.
		new LinkedHashMap<String, String>(int, float);				/// Belirtilen başlangıç ​​kapasitesi ve yük faktörü ile boş bir ekleme siparişli LinkedHashMap örneği oluşturur.
		new LinkedHashMap<String, String>(int, float, boolean);		/// Belirtilen başlangıç ​​kapasitesi, yük faktörü ve sipariş modu ile boş bir LinkedHashMap örneği oluşturur.
	}
}