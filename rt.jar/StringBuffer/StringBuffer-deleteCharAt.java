package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// dizide belitelen konumdaki karakteri siler
		System.out.println("Delete Char At: " + sb.deleteCharAt(0));
	}
}