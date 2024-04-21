
public class ConcurrentThreadDemo {

	public static void main(String[] args) {
	
        Thread t1 = new Thread(new ConcurrentTask(), "First Thread (T1)");
        Thread t2 = new Thread(new ConcurrentTask(), "Second Thread (T2)");
        Thread t3 = new Thread(new ConcurrentTask(), "Third Thread (T3)");

        // now, let's start all three threads
        t1.start();
        t2.start();
        t3.start();
    }
    private static class ConcurrentTask implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running now");
        }
    }

}


/*

  Concurrency is about processing more than one task at same time but not necessarily simultaneously, 
  It is applied to reduce the response time of the system by using the single processing unit.


*/