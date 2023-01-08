package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		Long lng = new Long(22);
		
		/// Verilen değeri String olarak döner.
		System.out.println("toString: " + lng.toString());
		
		/// Verilen değeri String olarak döner.
		System.out.println("toString: " + Long.toString(22));
		
		/// Verilen değeri String olarak döner. Tabanı belirtirsen onu döner
		System.out.println("toString: " + Long.toString(22, 2));
	}
}