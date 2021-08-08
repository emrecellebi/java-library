package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello World");
		
		/// bu dizeden varilen start ve end değerleri ile arasındaki alır yeni bir dizi olarak döner
		System.out.println("Sub Sequence: " + sb.subSequence(2, 5));
	}
}