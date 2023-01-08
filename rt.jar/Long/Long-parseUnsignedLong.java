package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		/// String gelen veriyi long tipine dönüştürür.
		System.out.println("parseUnsignedLong: " + Long.parseUnsignedLong("22"));
		
		/// String gelen veriyi verilen tabana göre long tipine dönüştürür. 3 ile 36 tabanları destekler.
		System.out.println("parseUnsignedLong: " + Long.parseUnsignedLong("22", 10));
	}
}