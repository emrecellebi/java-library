package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		Boolean bool = new Boolean("true");
		
		/// İki boolean değerinin karşlaştırır. x == y ise 0, x doğru ise 1 değil ise -1
		System.out.println("compare: " + Boolean.compare(false, true));
	}
}