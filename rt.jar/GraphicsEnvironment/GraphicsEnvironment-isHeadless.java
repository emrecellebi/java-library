package com.emrecellebi;

import java.awt.GraphicsEnvironment;

public class Console
{
	public static void main(String[] args)
	{
		System.out.println("isHeadless: " + GraphicsEnvironment.isHeadless());
	}
}