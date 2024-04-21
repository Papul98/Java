import java.io.*;
import java.sql.*;

public class Prepare_Insert
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

		      System.out.print("\nEnter Name        : ");
		      NAME=dis.readLine();

		      System.out.print("\nEnter Marks        : ");
		      MARKS=Double.parseDouble(dis.readLine());


		      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		      con=DriverManager.getConnection("jdbc:odbc:cmc","scott","tiger");
		      con.setAutoCommit(false);

		      String ins="insert into bithi (name,id,marks) values(?,?,?)";

		      PreparedStatement psmt=con.prepareStatement(ins);

		      psmt.setString(1,NAME);
		      psmt.setString(2,CODE);
		      psmt.setDouble(3,MARKS);

		      int x=psmt.executeUpdate();


		      System.out.print("\n\n Record Inserted \n\n");
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