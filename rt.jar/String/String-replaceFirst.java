package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia-McCormick";
		
		/// Verilen normal ifadeyle eşleşen bu dizenin ilk alt dizesini verilen değiştirme ile değiştirir.
		System.out.println("Replace First: " + str.replaceFirst("fia", "ick"));
	}
} 