package dummy1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@todos_tpurgent", "MyDbUsername", "$3cR3tP4s$w0rD");
//		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM EMPLOYEES");
//		while(rs.next())
//			System.out.println(rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString("SALARY"));
		System.out.println("Hello world");
	}

}
