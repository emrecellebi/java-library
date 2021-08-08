package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		char[] data2 = new char[30];
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// Karakterler bu diziden dst hedef karakter dizisine kopyalanır.
		/// srcBegin -> Kopyalanacak dizedeki ilk karakterin dizini
		/// srcEnd -> Kopyalanacak dizedeki son karakterden sonraki dizin
		/// dst -> Kopyalanacak char array
		/// dstBegin -> Hedef dizi deki başlangıç ​​ofseti
		sb.getChars(2, 6, data2, 0);
		for(char x : data2)
			System.out.println("Get Chars: " + x);
	}
}