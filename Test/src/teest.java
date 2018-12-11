import java.sql.*;

public class teest{
	
	public static void main(String[] args) {

		MysqlCon sql = new MysqlCon();
		Connection con = sql.Con();
		try {
			Statement stmt = con.createStatement();	
//			stmt.executeUpdate("drop table application;");
			ResultSet rs = stmt.executeQuery("show tables;");
			while(rs.next())
				System.out.println(rs.getString(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
