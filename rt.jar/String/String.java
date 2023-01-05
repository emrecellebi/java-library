package com.emrecellebi;

public class Console
{	
	public static void main(String[] args) throws Exception
	{
		byte[] data = {75, 108, 101, 111, 102, 105, 97};
		char[] data2 = {'K', 'l', 'e', 'o', 'f', 'i', 'a'};
		int[] data3 = {75, 108, 101, 111, 102, 105, 97};
		
		String str1 = new String();							/// Default Constructor
		System.out.println("String: " + str1);
		
		String str2 = new String("Kleofia McCormick");		/// String Constructor
		System.out.println("String: " + str2);
		
		String str3 = new String(data);						/// Byte array alan Constructor
		System.out.println("String: " + str3);
		
		/// UnsupportedEncodingException Throws Eder
		String str4 = new String(data, "UTF-8");			/// Byte array ve Kodla türü alan Constructor
		System.out.println("String: " + str4);
		
		/// Deprecated Method
		String str5 = new String(data, 0);
		System.out.println("String: " + str5);
		
		String str6 = new String(data, 0, data.length);		/// Byte array, offset, length alır.
		System.out.println("String: " + str6);
		
		/// UnsupportedEncodingException Throws Eder
		String str7 = new String(data, 0, data.length, "UTF-8");/// Byte array, offset, length, Kodla türü alır.
		System.out.println("String: " + str7);
		
		/// Deprecated Method
		String str8 = new String(data, 0, 0, data.length);
		System.out.println("String: " + str8);
		
		String str9 = new String(data2);
		System.out.println("String: " + str9);
		
		String str10 = new String(data2, 0, data2.length);/// char array, offset, length alır.
		System.out.println("String: " + str10);
		
		String str11 = new String(data3, 0, data3.length);/// int array, offset, length alır.
		System.out.println("String: " + str11);
	
		String str12 = new String(new StringBuilder("Kleofia McCormick"));
		System.out.println("String: " + str12);
		
		String str13 = new String(new StringBuffer("Kleofia McCormick"));
		System.out.println("String: " + str13);
		
		// String(byte[], Charset);
		// String(byte[], int, int, Charset);
		// String(char[], boolean); protected
	}
}