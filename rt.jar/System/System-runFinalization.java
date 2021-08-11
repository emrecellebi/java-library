package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		/// Sonlandırma bekleyen tüm nesnelerin sonlandırma yöntemlerini çalıştırır.
		
		System.out.println("Test 1");
		System.runFinalization();
		System.out.println("Test 2");
	}
}

