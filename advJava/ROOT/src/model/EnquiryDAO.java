package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.mysql.jdbc.Driver;

import controller.SendMail;

public class EnquiryDAO {

	public EnquiryDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public int generateEid() throws SQLException
	{
		Connection con=getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT MAX(eid) FROM enquiry");
		int id=1;
		if(rs.next())
		{
			int no=rs.getInt(1);
			id=no+1;
		}
		return id;
	}
	
	public void addEnquiry(Enquiry enquiry) throws SQLException
	{
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO enquiry VALUES(?,?,?,?,?)");
		int eid=generateEid();
		st.setInt(1, eid);
		st.setString(2, enquiry.getFirstName());
		st.setString(3, enquiry.getLastName());
		st.setString(4, enquiry.getEmail());
		st.setString(5, enquiry.getPhone());
		int no=st.executeUpdate();
		System.out.println(no+" row inserted");
		if(no>0)
		{
			//send email to jag@upskillit.com
			String msg=enquiry.toString();
			SendMail.send("rjagadeeswaran@gmail.com", "Enquiry", msg, "upskillit.jag@gmail.com", "Jagsuba@123");
		}
		con.close();
	}

	public Connection getConnection() throws SQLException {
		ResourceBundle prop = ResourceBundle.getBundle("db");
		String url=prop.getString("url");
		String uid=prop.getString("uid");
		String pwd=prop.getString("pwd");
		String dateFormat=prop.getString("dateFormat");
		Driver driver=new com.mysql.jdbc.Driver();
		Connection con = DriverManager.getConnection(url, uid, pwd);
		return con;
	}
	public List<Enquiry> retrieveEnquiries() throws SQLException
	{
		Connection con=getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT MAX(eid) FROM enquiry");
		List<Enquiry> enquiryList=new ArrayList<>();
		while(rs.next())
		{
			Enquiry enquiry=new Enquiry(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			enquiryList.add(enquiry);
		}
		return enquiryList;
	}

}
