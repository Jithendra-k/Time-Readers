import java.sql.*;

public class Demo_Select 
{
	public static void main(String args[])throws Exception
	{
		// load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// connection establishment
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","student","student");
		
		// creating the statement
		PreparedStatement  pstmt= con.prepareStatement("select * from admin");
		
		ResultSet rs = pstmt.executeQuery();
		
			while (rs.next())
			{
				System.out.println("Username is = "+ rs.getString(1) + "\n" + "Email is = "+ rs.getString(2) + "\n" + "Password is = " + rs.getString(3));
			}
			
			// close the connection
		con.close();
	
	}
}