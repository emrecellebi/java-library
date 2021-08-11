package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		/// Belirtilen değer eğerki eşleşirse onu index numarasını döner eşleşmezse -1 döner.
		String str = "Kleofia McCormick";
		
		/// Belirtilen karakterin ilk oluşumunun bu dizesindeki dizini döndürür. Bulunumazsa -1 Döner
		System.out.println("Index Of: " + str.indexOf("Kleofia"));
		
		/// Karakteri Unicode Olarak Alır. Eleman Sırasını Verir.
		System.out.println("Index Of: " + str.indexOf(111));
		
		/// Unicode ve Aramayı Başlatacağı Karakter Sayısı String, fromIndex;
		System.out.println("Index Of: " + str.indexOf(111, 8));
		
		/// String ve Aramayı Başlatacağı Karakter Sayısı String, fromIndex;
		System.out.println("Index Of: " + str.indexOf("Mc", 1));
	}
} 