import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDaoImpl {
	public void create(Student student) throws SQLException {
		//add a new row to the STUDENT table
		Connection con = getMyConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?)");
		st.setInt(1, student.getId());
		st.setString(2, student.getName());
		st.setString(3, student.getAddress());
		st.setString(4, student.getPhone());
		int no=st.executeUpdate();
		System.out.println(no+" row inserted");
		con.close();
	}
	
	public void read() throws SQLException {
		Connection con = getMyConnection();
		con.close();
	}
	public void read(Integer id) throws SQLException {
		Connection con = getMyConnection();
		con.close();
	}
	public void update() throws SQLException {
		Connection con = getMyConnection();
		con.close();
	}
	public void delete() throws SQLException {
		Connection con = getMyConnection();
		con.close();
	}

	private Connection getMyConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:h2:file:./data/sampledata","sa","");
		return con;
	}
}
