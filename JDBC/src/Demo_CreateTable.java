import java.sql.*;
import java.util.*;

public class Demo_CreateTable
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");
		Statement stmt= con.createStatement();
		String qry ="create table admin(username varchar2(20)primary key, email varchar2(20), password varchar2(20))";
		int r= stmt.executeUpdate(qry);
		System.out.println("Table created successfully..............");
	
	}

}