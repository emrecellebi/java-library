package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		String str = "Kleofia McCormick";
		
		/// Bu diziyi varsayılan karakter kmesini kullanarak bir byte arrayi döner. 
		byte[] data = str.getBytes();
		for(int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
		
		System.out.println();
		
		/// UnsupportedEncodingException Throws Eder.
		byte[] data2 = str.getBytes("UTF-8");
		for(int i = 0; i < data2.length; i++)
			System.out.print(data2[i] + " ");
		
		System.out.println();
		
		/// Deprecated Method
		int srcBegin = 0, srcEnd = 7, dstBegin = 0;
		byte[] dst = new byte[7];
		str.getBytes(srcBegin, srcEnd, dst, dstBegin);
		for(int i = 0; i < dst.length; i++)
			System.out.print(dst[i] + " ");
		
		System.out.println();
		
		/// getBytes(Charset):byte[] yapılıcak
	}
} 