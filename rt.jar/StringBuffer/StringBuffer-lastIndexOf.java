package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Belirtilen alt dizenin son oluşumunun bu dizesindeki dizini döndürür.
		/// Belirtilen değer eğerki eşleşirse onu index numarasını döner eşleşmezse -1 döner.
		System.out.println("Last Index Of: " + sb.lastIndexOf("Hel"));
		
		/// Parameters: derğer, aramaya başlayacağı sayı
		/// Verilen değer aranıp bulunduğunda bize onu index numarasını verir
		System.out.println("Last Index Of: " + sb.lastIndexOf("Wor", 2));
	}
}