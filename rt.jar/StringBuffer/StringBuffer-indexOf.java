package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Belirtilen karakterin ilk oluşumunun bu dizesindeki dizini döndürür. Bulunumazsa -1 Döner
		System.out.println("Index Of: " + sb.indexOf("Hello"));
		
		/// String ve Aramayı Başlatacağı Karakter Sayısı String, fromIndex;
		System.out.println("Index Of: " + sb.indexOf("lo", 1));
	}
}