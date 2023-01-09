package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		/// String gelen veriyi int tipine dönüştürür.
		System.out.println("parseInt: " + Long.parseInt("22"));
		
		/// String gelen veriyi verilen tabana göre int tipine dönüştürür. 3 ile 36 tabanları destekler.
		System.out.println("parseInt: " + Long.parseInt("22", 10));
	}
}