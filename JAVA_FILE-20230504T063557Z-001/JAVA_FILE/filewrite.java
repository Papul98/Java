import java.io.*;
public class filewrite
{
	public static void main(String args[])
	{
		byte buffer[]=new byte[64];
		try
		{
			System.out.print("\n Enter something :\n\n");
			System.in.read(buffer,0,64);
            FileOutputStream fout=new FileOutputStream("D:\\Language\\Java\\Papul.txt");
            fout.write(buffer);
            	
		}
		catch(Exception e)
		{
			System.out.print("Error"+e.getMessage());
		}		
	}
}