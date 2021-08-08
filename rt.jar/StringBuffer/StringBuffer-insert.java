package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		CharSequence str1 = "Hello";
		String str2 = "Hello World";
		boolean a = true;
		char b = 'A';
		char[] c = {'Z', 'E', 'Y', 'X', 'G', 'H', 'T'};
		double e = 25.25;
		float f = 3.14f;
		int i = 5;
		long l = 245869;
	
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Boolean değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, a));
		
		/// Char değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, b));
		
		/// Char[] değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, c));
		
		/// Char[] değerini belirtilen yere göre ekler
		// Prameters: int -> eklenecek yer, char[] str -> karakter dizesi, int offset -> başlangıc hanesi, int len -> son hanesi 
		System.out.println("Insert: " + sb.insert(5, c, 2, 5));
		
		/// CharSequence değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, str1));
		
		/// CharSequence değerini belirtilen yere göre ekler
		// Prameters: int -> eklenecek yer, CharSequence str -> karakter dizesi, int start -> başlangıc indexi, int end -> bitiş indexi 
		System.out.println("Insert: " + sb.insert(5, str1, 2, 5));
		
		/// double değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, e));
		
		/// float değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, f));
		
		/// int değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, i));
		
		/// long değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, l));
		
		/// String değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, str2));
		
		/// Object değerini belirtilen yere göre ekler
		System.out.println("Insert: " + sb.insert(5, Object));
	}
}