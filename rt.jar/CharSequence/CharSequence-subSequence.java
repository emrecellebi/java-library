package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		CharSequence str = "emrecellebi";
		
		/// Bu dizinin bir alt dizisi olan bir CharSequence döndürür
		/// Parameters: start, end
		System.out.println("Sub Sequence: " + str.subSequence(5, 8));
	}
}

