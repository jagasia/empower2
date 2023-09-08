package dummy1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class App {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM EMPLOYEES WHERE SALARY>15000");
		while(rs.next())
			System.out.println(rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString("SALARY"));
		DriverManager.deregisterDriver(driver);
		System.out.println("Hello world");
	}

}
