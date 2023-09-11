import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	public void createTable() throws SQLException
	{
		Connection con = getMyConnection();
		Statement st = con.createStatement();
		st.execute("CREATE TABLE STUDENT(ID INT PRIMARY KEY,NAME VARCHAR2(20),ADDRESS VARCHAR2(50),PHONE VARCHAR2(13));");
		con.close();
	}
	
	@Override
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
	
	@Override
	public List<Student> read() throws SQLException {
		Connection con = getMyConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM STUDENT");
		List<Student> studentList=new ArrayList<>();
		while(rs.next())
		{
			Student student=new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			studentList.add(student);
		}
		con.close();
		return studentList;
	}
	@Override
	public Student read(Integer id) throws SQLException {
		Connection con = getMyConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM STUDENT WHERE ID=?");
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		Student student=null;
		if(rs.next())
		{
			student=new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
		}
		con.close();
		return student;
	}
	@Override
	public void update(Student student) throws SQLException {
		Connection con = getMyConnection();
		PreparedStatement st = con.prepareStatement("UPDATE STUDENT SET name=?, address=?, phone=? WHERE id=?");
		st.setString(1, student.getName());
		st.setString(2, student.getAddress());
		st.setString(3, student.getPhone());
		st.setInt(4, student.getId());
		int no=st.executeUpdate();
		System.out.println(no+" row updated");
		con.close();
	}
	@Override
	public void delete(Integer id) throws SQLException {
		Connection con = getMyConnection();
		PreparedStatement st = con.prepareStatement("DELETE FROM STUDENT WHERE ID=?");
		st.setInt(1, id);
		int no=st.executeUpdate();
		System.out.println(no+" row deleted");
		con.close();
	}

	private Connection getMyConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:h2:file:./data/sampledata.mv","sa","");
		return con;
	}
}
