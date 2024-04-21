import java.io.*;
public class FileExist
{
	public static void main(String args[])
	{
            String s="D:\\papul";
		File file=new File(args[0]);
		
		if(!file.exists())
		{
			System.out.print(args[0]+" does not exist");
			return;
		}
		if(!(file.isFile() && file.canRead()))
		{
			System.out.print(file.getName()+" cannot be read from ");
	    	return;
		}
		try
		{
			FileInputStream fis=new FileInputStream(file);
			char ch;
			while(fis.available()>0)
			{
				ch=(char)fis.read();
				System.out.print(ch);
			}
		}
		
		catch(IOException e)
		{
			System.out.println("\n\n*******"+e.getMessage());
		}
	}
}

/* NOTES::
 1)if input is given folder name instead of file name then enter in 
   the second if 
 2)as we check the file existance and file read previously so the 
   IOException block does not execute at all */