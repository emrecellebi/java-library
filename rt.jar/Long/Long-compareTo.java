package com.emrecellebi;

public class Console
{
	public static void main(String[] args)
	{
		Long lng = new Long(22);
		
		/// x == y eşit ise 0 değeri, x < y ise 1 değeri, x > y ise -1 değerini döner.
		System.out.println("compareTo: " + lng.compareTo(new Long("22")));
	}
}