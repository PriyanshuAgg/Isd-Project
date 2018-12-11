import java.util.ArrayList;
import java.sql.*;
import java.time.format.DateTimeFormatter;

public class PurchReqCont {
	
	public PurchReqCont(Intender intn, ArrayList<Product> P,Application appl) {
		
		System.out.println("In PurchReqCont");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		MysqlCon sql = new MysqlCon();
		Connection con = sql.Con();
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into application values(1,'"+appl.getTitle()+"','"+appl.getStatus()+"','',"+intn.getId()+","+dtf.format(appl.getDate()));
//			ResultSet rs = stmt.executeQuery("insert into application values(1,'"+appl.getTitle()+"','"+appl.getStatus()+"','',"+intn.getId()+","+dtf.format(appl.getDate()));
//			while(rs.next())
//				System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
