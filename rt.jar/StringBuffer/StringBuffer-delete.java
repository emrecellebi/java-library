package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// dizide belitelen alanrı siler
		System.out.println("Delete: " + sb.delete(0, 5));
	}
}