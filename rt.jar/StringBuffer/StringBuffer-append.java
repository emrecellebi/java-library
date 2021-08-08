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
		
		StringBuffer sb = new StringBuffer();
		
		/// boolean değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(a));
		
		/// char değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(b));
		
		/// char array değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(c));
		
		/// char array değerini bir string olarak ekler.
		// Prameters: char[] str -> karakter dizesi, int offset -> başlangıc hanesi, int len -> son hanesi 
		System.out.println("Append: " + sb.append(c, 2, 2));
		
		/// CharSequence değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(str1));
		
		/// CharSequence değerini bir string olarak ekler.
		// Prameters: CharSequence str -> karakter dizesi, int start -> başlangıc indexi, int end -> bitiş indexi 
		System.out.println("Append: " + sb.append(str1, 2, 4));
		
		/// double değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(e));
		
		/// float değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(f));
		
		/// int değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(i));
		
		/// long değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(l));
		
		/// String değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(str2));
		
		/// StringBuffer değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append(sb));
		
		/// Object değerini bir string olarak ekler.
		System.out.println("Append: " + sb.append());
	}
}