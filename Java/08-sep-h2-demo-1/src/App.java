import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:h2:file:./data/sampledata","sa","");
		PreparedStatement st = con.prepareStatement("INSERT INTO EMP VALUES(?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		Integer id=sc.nextInt();
		String firstName=sc.nextLine();
		if(firstName.equals(""))
			firstName=sc.nextLine();
		String lastName=sc.nextLine();
		Integer salary=sc.nextInt();
		st.setInt(1, id);
		st.setString(2, firstName);
		st.setString(3, lastName);
		st.setInt(4, salary);
		int no=st.executeUpdate();
		System.out.println(no+" row(s) affected");
		con.close();
	}

}
