package com.emrecellebi;

public class Test
{
	private String packet;
	private boolean transfer = true;
	
	public synchronized void send(String packet)
	{
		while(!transfer)
		{
			try
			{
				wait();
				System.out.println("Sending...");
			}
			catch(Exception e){}
		}
		transfer = false;
		
		this.packet = packet;
		notifyAll();
	}
	
	public synchronized String receive()
	{
		while(transfer)
		{
			try
			{
				wait();
				System.out.println("Receiving...");
			}
			catch(Exception e){}
		}
		transfer = true;
		notifyAll();
		return packet;
	}
	
	public static void main(String[] args)
	{
		Test test = new Test();
		test.send("Zeynep");
		System.out.println(test.receive());
	}
}