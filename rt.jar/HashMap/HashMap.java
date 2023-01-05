package com.emrecellebi;

import java.util.HashMap;
import java.util.Map;

public class Console
{
	public static void main(String[] args)
	{
		new HashMap<String, String>();					/// Varsayılan başlangıç ​​kapasitesi (16) ve varsayılan yük faktörü (0,75) ile boş bir HashMap oluşturur.
		new HashMap<String, String>(Map<K, V>);			/// Belirtilen Harita ile aynı eşlemelere sahip yeni bir HashMap oluşturur.
		new HashMap<String, String>(int);				/// Belirtilen başlangıç ​​kapasitesi ve varsayılan yük faktörü (0,75) ile boş bir HashMap oluşturur.
		new HashMap<String, String>(int, float);		/// Belirtilen başlangıç ​​kapasitesi ve yük faktörü ile boş bir HashMap oluşturur.
	}
}