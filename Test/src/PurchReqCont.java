import java.util.ArrayList;
import java.sql.*;

public class PurchReqCont {
	
	public PurchReqCont(Intender intn, ArrayList<Product> P,Application appl) {
		
		System.out.println("In PurchReqCont");
		MysqlCon sql = new MysqlCon();
		Connection con = sql.Con();
		try {
			appl.setID(1);
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into application value("+appl.getID()+","+intn.getId()+",'"+appl.getTitle()+"','"+appl.getStatus()+"',' ','"+appl.getDate()+"','"+appl.getDesc()+"');");
			System.out.println("Application added");
			for(int i=0;i<P.size();i++) {
				System.out.print("inside for of product ");
				stmt.executeUpdate("insert into product values("+appl.getID()+",'"+P.get(i).getName()+"','"+P.get(i).getDesc()+"','"+P.get(i).getReason()+"',"+P.get(i).getCost()+",'"+P.get(i).getReq_specs()+"','"+P.get(i).getPref_specs()+"');");				
				System.out.println("Product added");
			}
//			ResultSet rs = stmt.executeQuery("insert into application values(1,'"+appl.getTitle()+"','"+appl.getStatus()+"','',"+intn.getId()+","+dtf.format(appl.getDate()));
//			while(rs.next())
//				System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
