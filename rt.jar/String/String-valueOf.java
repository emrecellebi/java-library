package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "emrecellebi";
		char a = 'X';
		char[] array = {'E', 'Z'};
		char[] array2 = {'E', 'Z', 'S', 'A', 'O'};
		boolean b = false;
		double d = 19.99;
		float f = 3.14f;
		int i = 25;
		long l = 789456123;
		
		/// Veilen değerleri String olarak geri verir.
		System.out.println("Value Of: " + String.valueOf(str));
		System.out.println("Value Of: " + String.valueOf(a));
		System.out.println("Value Of: " + String.valueOf(b));
		System.out.println("Value Of: " + String.valueOf(array));
		System.out.println("Value Of: " + String.valueOf(array2, 1, 3));
		System.out.println("Value Of: " + String.valueOf(d));
		System.out.println("Value Of: " + String.valueOf(f));
		System.out.println("Value Of: " + String.valueOf(i));
		System.out.println("Value Of: " + String.valueOf(l));
	}
} 