package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		Long lng = new Long(22);

		/// Karma bir değer döner.
		System.out.println("hashCode: " + lng.hashCode());
		
		/// Karma bir değer döner.
		System.out.println("hashCode: " + Long.hashCode(22));
	}
}