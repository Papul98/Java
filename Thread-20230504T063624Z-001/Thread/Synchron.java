
	class Callme 
	{
   		void call(String msg) 
   		{
      		System.out.print("[" + msg +"]");
      			try 
      			{
         			Thread.sleep(1000);
      			} 
      			catch (InterruptedException ex) 
      			{
         		System.out.println("Interrupted");
      			}
      			System.out.println();
   		}
	}




	class Caller implements Runnable 
	{
   		String msg;
   		Callme target;
   		Thread t;
   		public Caller(Callme targ, String s) 
   		{
      		target = targ;
      		msg = s;
      		t = new Thread(this);
      		t.start();
   		}
      
   		public void run() 
   		{
      		synchronized(target) 
      		{ 
      		// synchronized block
         	target.call(msg);
      		}
   		}
	}	
	
	class Synchron 
	{
   		public static void main(String args[]) 
   		{
      		Callme target = new Callme();     		
      		Caller ob1 = new Caller(target, "TATA");
      		Caller ob2 = new Caller(target, "SOUVIK");
      		Caller ob3 = new Caller(target, "CMC");
   			
      		try 
      		{
         		ob1.t.join();
         		ob2.t.join();
         		ob3.t.join();
      		}
      		catch(InterruptedException ex) 
      		{
         		System.out.println("Interrupted");
      		}
   		}
	}