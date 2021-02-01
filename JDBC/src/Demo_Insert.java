/* JDBC Demo for Inserting into Table */
import java.sql.*;

public class Demo_Insert 
{
	public static void main(String[] args) 
    {	try
		{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student","student");
    		PreparedStatement pstmt=con.prepareStatement("insert into admin values(?,?,?)");
    		pstmt.setString(1, "Jithendra_k");
    		pstmt.setString(2, "jithendra@gmail.com");    			
    		pstmt.setString(3, "student");
    		boolean n = pstmt.execute();   			
    		System.out.println("return value = "+ n);
    		if(n)
    			System.out.println("- - - - One Record inserted successful - - - -");
    		else
    			System.out.println("- - - - One Record inserted successful - - - -");
		}
		catch(ClassNotFoundException | SQLException e)
		{		
			System.out.println(e);  
		}
	}
}