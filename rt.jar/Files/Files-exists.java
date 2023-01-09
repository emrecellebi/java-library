package com.emrecellebi;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Console
{
	public static void main(String[] args)
	{
		System.out.println("exists: " + Files.exists(Paths.get("./", "Test/dir/01.txt")));
	}
}