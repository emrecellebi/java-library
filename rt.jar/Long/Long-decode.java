package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		/// Bir string olarak verilen hex kodu veya desimal değerini longa dönüştürür. 
		try{System.out.println("decode: " + Long.decode("0x16"));}catch(NumberFormatException e){e.printStackTrace();}
	}
}