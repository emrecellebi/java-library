package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		CharSequence str2 = "emrecellebi";
		StringBuffer str3 = new StringBuffer("emrecellebi");
		String str4 = "emrecellebi";
		boolean bb = true;
		char a = 'Z';
		char[] b = {'A', 'B', 'G', 'f'};
		double d = 32.58;
		float f = 3.14f;
		int i = 22;
		long l = 2456987895;
		StringBuilder sb = new StringBuilder("Hello World");
		
		/// Belirtilen CharSequence değerini bu diziye ekler
		System.out.println("Append: " + sb.append(str2));
		
		/// Belirtilen CharSequence değerini bu diziye ekler
		/// Parameters: Eklenecek değer, start, end
		System.out.println("Append: " + sb.append(str2, 2, 8));
		
		/// Belirtilen String değerini bu diziye ekler
		System.out.println("Append: " + sb.append(str4));
		
		/// Belirtilen boolean değerini bu diziye ekler
		System.out.println("Append: " + sb.append(bb));
		
		/// Belirtilen StringBuffer değerini bu diziye ekler
		System.out.println("Append: " + sb.append(str3));
		
		/// Belirtilen char[] değerini bu diziye ekler
		System.out.println("Append: " + sb.append(b));
		
		/// Belirtilen char değerini bu diziye ekler
		System.out.println("Append: " + sb.append(a));
		
		/// Belirtilen char değerini bu diziye ekler
		/// Parameters: array, start, end
		System.out.println("Append: " + sb.append(b, 1, 2));
		
		/// Belirtilen double değerini bu diziye ekler
		System.out.println("Append: " + sb.append(d));
		
		/// Belirtilen float değerini bu diziye ekler
		System.out.println("Append: " + sb.append(f));
		
		/// Belirtilen int değerini bu diziye ekler
		System.out.println("Append: " + sb.append(i));
		
		/// Belirtilen long değerini bu diziye ekler
		System.out.println("Append: " + sb.append(l));
		
		/// Belirtilen Object değerini bu diziye ekler
		System.out.println("Append: " + sb.append(Object));
	}
}

