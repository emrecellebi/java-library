package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		/// Verilen değeri Long nesnesi olarak döner.
		System.out.println("valueOf: " + Long.valueOf("22"));
		
		/// Verilen değeri belirtilen tabana göere Long nesnesi olarak döner.
		System.out.println("valueOf: " + Long.valueOf("10110", 2));
		
		/// Verilen değeri Long nesnesi olarak döner.
		System.out.println("valueOf: " + Long.valueOf(22));
	}
}