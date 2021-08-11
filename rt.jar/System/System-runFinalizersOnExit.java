package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		/// Bu yöntem doğası gereği güvenli değildir. Diğer iş parçacıkları aynı anda bu nesneleri manipüle ederken, sonlandırıcıların canlı nesneler üzerinde çağrılmasına neden olabilir, bu da düzensiz davranış veya kilitlenmeye neden olabilir.
		System.runFinalizersOnExit(true);
		System.out.println("Test 2");
	}
}

