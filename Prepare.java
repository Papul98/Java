import java.io.*;
import java.sql.*;

public class Prepare
{
	public static void main(String a[])throws Exception
	   {

		 Connection con;
		 String NAME,CODE;
		 double MARKS;
		 try
		    {
		      DataInputStream dis=new DataInputStream(System.in);

		      System.out.print("\nEnter Id        : ");
		      CODE=dis.readLine();

		      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		      con=DriverManager.getConnection("jdbc:odbc:cmc","scott","tiger");
		      con.setAutoCommit(false);

		      String sel="select name,id,marks from bithi where id=?";
		      PreparedStatement psmt=con.prepareStatement(sel);
		      psmt.setString(1,CODE);
		      ResultSet rs=psmt.executeQuery();
		      System.out.print("\n Employee Details\n\n");

		      while(rs.next())
		       {
		       	 NAME=rs.getString(1);
		       	 MARKS=rs.getDouble(3);
		       	 System.out.print("\n"+CODE+"\t"+NAME+"\t"+MARKS);
		       }
		      System.out.print("\n");
		       con.commit();
		       con.close();
		    }



		  catch(SQLException se)

		   {
		      System.out.println("\n\n\nSQL EXCEPTION : "+se.getMessage());
		   }

       }
 }