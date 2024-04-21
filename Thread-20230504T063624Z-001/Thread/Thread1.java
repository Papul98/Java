import java.io.*;

class Thread1
{
public static void main(String args[])
{
	Thread th=Thread.currentThread();
	
	System.out.println("Current thread name :"+th);
	th.setName("SOUVIK");
	System.out.println("New thread name :"+th);
	try
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	catch(InterruptedException ex)
	{
		System.out.println(ex.getMessage());
	}
}
}