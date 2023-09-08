package dummy1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Hacking {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		String password=sc.nextLine();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM USER_MASTER WHERE username='"+username+"' AND password='"+password+"'");
		if(rs.next())
			System.out.println("Login successful");
		else
			System.out.println("Login failed");
		con.close();
	}

}
