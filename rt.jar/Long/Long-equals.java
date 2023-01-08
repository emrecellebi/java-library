package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		Long lng = new Long(22);
		
		System.out.println("equals: " + lng.equals(new Long("22")));	/// Verilen Long değerini karşılaştırır.
	}
}