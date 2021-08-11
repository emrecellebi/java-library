package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		char[] str = {'A', 'E', 'Z', 'S', 'O', 'P', 'R'};
		char[] str2 = new char[32];
		
		/// Belirtilen konumdan başlayarak belirtilen kaynak diziden hedef dizinin belirtilen konumuna bir dizi kopyalar.
		/// src -> Kopyalanılıcak Kaynak
		/// srcPos -> Kopyalanılıcak Kaynağın Bağlangıç değeri
		/// dest -> Kopyanın Kayıt Edileceği Array
		/// destPos -> Kopyalanın Kayıt Edileceği Arrayin Bağlangıç değeri
		/// length -> Kopyalanılıcak Karakterlerin Sayısı.
		try{System.arraycopy(str, 2, str2, 8, 3);}catch(Exception e){}
		
		for(char x : str)
			System.out.println("Not Copy: " + x);
		
		for(char y : str2)
			System.out.println("Copy: " + y);
	}
}