import java.io.*;
class concate
 {
 	public static void main(String args[])
 	 {
 	 	try
 	 	{
 	 	 FileInputStream fis1=new FileInputStream("C:\\Joy\\JAVA_FILE\\file.txt");
 	 	 FileInputStream fis2=new FileInputStream("C:\\Joy\\JAVA_FILE\\tanmoy.txt");
 	 	 int x;
 	 	 SequenceInputStream sis=new SequenceInputStream(fis1,fis2); 	 	
 	 	 while((x=sis.read())!=-1)
 	 	 {
 	 	 	System.out.print((char)x);
 	 	 }
 	 	}
 	 	
 	 	
 	 	catch(Exception e)
 	 	 {
 	 	 	System.out.print(e.getMessage());
 	 	 }
 	 	
 	 }
 }