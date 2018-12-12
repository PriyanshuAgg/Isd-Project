import java.sql.*;

public class teest{
	
	public static void main(String[] args) {

		MysqlCon sql = new MysqlCon();
		Connection con = sql.Con();
		try {
			Statement stmt = con.createStatement();	
//			stmt.executeUpdate("drop table application;");
			ResultSet rs = stmt.executeQuery("select * from application;");
			while(rs.next())
				System.out.println(rs.getString(4));

//				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
