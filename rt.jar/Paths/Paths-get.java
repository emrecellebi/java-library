package com.emrecellebi;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URI;

public class Console
{
	public static void main(String[] args)
	{
		System.out.println("get: " + Paths.get("TestPath", "Test", "Test2", "Test3"));
		System.out.println("get: " + Paths.get(new URI("file://docs.oracle.com/javase/8/docs/api/java/nio/file/Paths.html")));
	}
}