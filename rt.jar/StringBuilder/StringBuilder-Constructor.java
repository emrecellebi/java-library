package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		CharSequence str = "emrecellebi";
		String str2 = "emrecellebi";
		int i = 32;
		
		new StringBuilder();						/// Prametresiz Constructor
		new StringBuilder(str);						/// CharSequence Prametresi Alır.
		new StringBuilder(str2);					/// String Prametresi Alır.
		new StringBuilder(i);						/// int Prametresi Alır. Belitilen değer kadar bir kapasite oluşturlur içi boş olur.
	}
}

