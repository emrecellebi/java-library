package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// İki dize bölgesinin eşit olup olmadığını test eder.
		/// ignoreCase 	-> Büyük Küçük Duyarlılığı
		/// toffset 	-> bu dizedeki alt bölgenin başlangıç ​​uzaklığı.
		/// other 		-> Verilen String
		/// ooffset 	-> dize bağımsız değişkenindeki alt bölgenin başlangıç ​​uzaklığı.
		/// len 		-> karşılaştırılacak karakter sayısı
		System.out.println("Region Matches: " + str.regionMatches(true, 0, "Kleofia McCormick", 0, str.length()));
		
		/// toffset 	-> bu dizedeki alt bölgenin başlangıç ​​uzaklığı.
		/// other 		-> Verilen String
		/// ooffset 	-> dize bağımsız değişkenindeki alt bölgenin başlangıç ​​uzaklığı.
		/// len 		-> karşılaştırılacak karakter sayısı
		System.out.println("Region Matches: " + str.regionMatches(0, "Kleofia McCormick", 0, str.length()));
	}
} 