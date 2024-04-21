class Deadlockrisk
{
	 private static class Resource 
	 {
 	 	public int value;
 	 }
 	 private Resource resourceA = new Resource();
 	 private Resource resourceB = new Resource();
 	 public int read() 
 	 {
 	 synchronized(resourceA) 
 	 { 
 	 synchronized(resourceB) 
 	 {
 	 return resourceB.value + resourceA.value;
 	 }
 	 }
 	 }

 	 public void write(int a, int b) 
 	 {
 	 synchronized(resourceB) 
 	 { 
 	 synchronized(resourceA) 
 	 {
 	 resourceA.value = a;
 	 resourceB.value = b;
 	 System.out.println(resourceA.value);
 	 System.out.println(resourceB.value);
 	 }
 	 }
 	 }
 }
 
 class Deadlock
 {
 	public static void main(String args[])
 	{
 		Deadlockrisk obj1=new Deadlockrisk();
 		Deadlockrisk obj2=new Deadlockrisk();
 		
 		//obj1.read();
 		//obj2.read();
 		
 		
 		obj1.write(1,2);
 		obj2.write(3,4);
 		
 		System.out.println();
 		System.out.println(obj1.read());
 		System.out.println(obj2.read());
 		
 		
 	}
 	
 }