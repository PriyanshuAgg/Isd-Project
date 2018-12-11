import java.sql.*;

public class teest{
	
	public static void main(String[] args) {

		MysqlCon sql = new MysqlCon();
		Connection con = sql.Con();
		try {
			Statement stmt = con.createStatement();	
			ResultSet rs = stmt.executeQuery("describe product;");
			while(rs.next())
				System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
