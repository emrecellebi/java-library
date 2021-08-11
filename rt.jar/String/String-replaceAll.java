package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia-McCormick";
		
		/// Verilen normal ifadeyle eşleşen bu dizenin her alt dizesini verilen değiştirme ile değiştirir.
		System.out.println("Replace All: " + str.replaceAll("fia", "ick"));
	}
} 