package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia-McCor-mick";
		String[] str2 = str.split("-");
		
		/// Bu dizeyi, verilen normal ifadenin eşleşmeleri etrafında böler.
		System.out.println("Split: " + str2[0]);
		System.out.println("Split: " + str2[1]);
		
		/// Verilen String ve integer ile kaç sefer bölceğini belirtiriz.
		String[] str3 = str.split("-", 2);
		System.out.println("Split: " + str3[0]);
		System.out.println("Split: " + str3[1]);
	}
} 