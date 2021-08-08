package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		CharSequence str = "emrecellebi";
		CharSequence str2 = "emrecellebi";
		String str3 = new String("emrecellebi");
		String str4 = "emrecellebi";
		boolean bb = true;
		char a = 'Z';
		char[] b = {'A', 'B', 'G', 'f'};
		double d = 32.58;
		float f = 3.14f;
		int i = 22;
		long l = 2456987895;
		
		StringBuilder sb = new StringBuilder("Hello World ");
		
		/// Parameters: offset dizenin neresine ekleneceği beliler, değer
		System.out.println("Insert: " + sb.insert(8, str));
		
		/// Parameters: offset dizenin neresine ekleneceği beliler, Eklenecek değer, start, end
		System.out.println("Insert: " + sb.insert(2, str2, 5, 8));
		
		System.out.println("Insert: " + sb.insert(2, str3));
		
		System.out.println("Insert: " + sb.insert(2, str4));
		
		System.out.println("Insert: " + sb.insert(2, bb));
		
		System.out.println("Insert: " + sb.insert(2, a));
		
		System.out.println("Insert: " + sb.insert(2, b));
		
		/// Parameters: offset dizenin neresine ekleneceği beliler, Eklenecek array, start, end
		System.out.println("Insert: " + sb.insert(2, b, 8, 10));
		
		System.out.println("Insert: " + sb.insert(2, d));
		
		System.out.println("Insert: " + sb.insert(2, f));
		
		System.out.println("Insert: " + sb.insert(2, i));
		
		System.out.println("Insert: " + sb.insert(2, l));
	}
}

