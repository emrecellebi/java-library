package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello World ");
		
		/// Belirtilen alt dizenin ilk oluşumunun bu dizesindeki dizini döndürür.
		/// Belirtilen değer eğerki eşleşirse onu index numarasını döner eşleşmezse -1 döner.
		System.out.println("Index Of: " + sb.indexOf("Hel"));
		
		/// Parameters: derğer, aramaya başlayacağı sayı
		/// Verilen değer aranıp bulunduğunda bize onu index numarasını verir
		System.out.println("Index Of: " + sb.indexOf("Wor", 4));
	}
}

