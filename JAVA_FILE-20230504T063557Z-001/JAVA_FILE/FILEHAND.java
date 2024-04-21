import java.io.*;
public class Filehandle
{
	public static void main(String args[])
	{
		DataInputStream dis=new DataInputStream(System.in);
		String str1,str2;
		byte buffer1[]=new byte[64];

		try
		{
			System.out.print("\nEnter file path to write::");
			str1=dis.readLine();
			System.out.print("\nEnter file content::");
			System.in.read(buffer1,0,64);
			FileOutputStream fout=new FileOutputStream(str1);
			fout.write(buffer1);
			
			System.out.print("\nEnter file path to read::");
			str2=dis.readLine();
			FileInputStream fin=new FileInputStream(str2);
			fin.read(buffer1,0,64);
			String s=new String(buffer1,0);
			System.out.print(s);
			
		}
		catch(Exception e)
		{
			System.out.print("Error::"+e.getMessage());
		}
		
	}
}