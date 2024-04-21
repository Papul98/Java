   class NameRunnable implements Runnable 
   { 
         public void run() 
         {
         	try
         	{
			for (int x = 1; x <= 3; x++) 
			{
				System.out.println("Run by "+ Thread.currentThread().getName()+ ", x is " + x);
				Thread.sleep(500);
			}
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}
		 }
   }
	
	
	public class Manynames 
	{
		public static void main(String [] args) 
		{
			// Make one Runnable
			NameRunnable nr = new NameRunnable();
			
			
			Thread one = new Thread(nr);
			Thread two = new Thread(nr);
			Thread three = new Thread(nr);

			one.setName("Souvik");
			two.setName("SVK");
			three.setName("CMC");
			one.start();
			two.start();
			three.start();
		}
	}