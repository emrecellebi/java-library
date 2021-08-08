package com.emrecellebi;

public class Test implements Cloneable
{
	private String str;
	
	public Test(String str)
	{
		this.str = str;
	}
	
	public void setString(String str){this.str = str;}
	
	public void display()
	{
		System.out.println("The String is " + str);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static void main(String[] args)
	{
		try
		{
			Test myClass = new Test("Zeynep");
			Test clonedMyClass = (Test)myClass.clone();
			clonedMyClass.display();
		}
		catch(CloneNotSupportedException e){}
	}
}