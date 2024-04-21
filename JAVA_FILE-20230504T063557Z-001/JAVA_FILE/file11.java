/**
 * @(#)file.java
 */

import java.io.*;

public class file11 
{
    public static void main(String[] args) 
    {
        String s="d:\\papul\\";
        File file=new File(s);
        
		if(!file.exists())
		{
			System.out.print(s+" does not exist");
			return;
		}		
		try
		{
			
			System.out.print("\n content of the file \n\n");

			String st[]=file.list();
			for(int i=0;i<st.length;i++)
			{
				
				System.out.println(st[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("\n\n*******"+e.getMessage());
		}
    }
}
