
 import java.io.*;
 
public class fileappent {
    public static void main(String[] args) {
     try
    	{
    	 RandomAccessFile rs = new RandomAccessFile("C:\\Joy\\JAVA_FILE\\Tanmoy.txt","rw");

    		rs.seek(rs.length());
    		
    		rs.writeBytes("\n hello Joy. how are you");
    	}
    	catch(Exception e)
    	{
    		System.out.print(e.getMessage());
    	}
    }
}
