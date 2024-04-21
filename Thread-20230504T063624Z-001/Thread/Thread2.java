import java.io.*;

class Souvik extends Thread
{
	Souvik()
        {
           start();
        }
	
       public void run()
	{
		System.out.println("HI");
	}

       public void run(String S)
	{
		System.out.println("Welcome"+S);
	}
}

class Thread2
{
	public static void main(String args[])
	{
		Souvik obj=new Souvik();
		obj.run();
		obj.run("CMC");
	}
}