import java.sql.*;

class MysqlCon{
	
	public Connection Con(){
		Connection con = null;
//		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			con=DriverManager.getConnection("jdbc:mysql://localhost/Purchase","root","16ucs142");
//			stmt=con.createStatement();
			System.out.println("Connection Succesful");
//			ResultSet rs=stmt.executeQuery("select * from user");
//			while(rs.next())
//				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//			con.close();
			}
		catch(Exception e)
		{ 
			e.printStackTrace();
			}
		return con;
		
	}
}