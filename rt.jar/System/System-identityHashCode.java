package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "emrecellebi";
		
		/// Verilen nesnenin sınıfı hashCode()'u geçersiz kılıyor olsun ya da olmasın, varsayılan yöntem hashCode() tarafından döndürüleceği gibi, verilen nesne için aynı karma kodu döndürür.
		System.out.println(System.identityHashCode(str));
	}
}