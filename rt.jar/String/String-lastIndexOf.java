package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Belirtilen karakterin son oluşumunun bu dizesindeki dizini döndürür. Bulunumazsa -1 Döner
		System.out.println("Index Of: " + str.lastIndexOf("Kleofia"));
		
		/// Karakteri Unicode Olarak Alır. Eleman Sırasını Verir.
		System.out.println("Index Of: " + str.lastIndexOf(111));
		
		/// Unicode ve Aramayı Başlatacağı Karakter Sayısı String, fromIndex;
		System.out.println("Index Of: " + str.lastIndexOf(111, 8));
		
		/// String ve Aramayı Başlatacağı Karakter Sayısı String, fromIndex;
		System.out.println("Index Of: " + str.lastIndexOf("KL", 1));
	}
} 