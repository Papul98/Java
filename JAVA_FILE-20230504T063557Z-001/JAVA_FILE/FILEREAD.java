import java.io.*;

class FILEREAD
 {
 	public static void main(String args[])
 	 {
 	 	try
 	 	{
 	 	FileInputStream fis=new FileInputStream("C:\\Joy\\JAVA_FILE\\file.txt");
 	 	byte b[]=new byte[64]; 	 	
 	 	fis.read(b,0,64);	 	
 	 	
 	 	String s=new String(b,0);
 	 	
 	 	System.out.print(s);
 	 	System.out.print("\n\n");
 	 	
 	 	}
 	 
 	 	catch(Exception e)
 	 	 {
 	 	 	System.out.print(e.getMessage());
 	 	 }
 	 }
 	
 }