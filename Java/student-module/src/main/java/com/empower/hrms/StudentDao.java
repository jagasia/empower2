package com.empower.hrms;
import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
	public void createTable() throws SQLException;

	void create(Student student) throws SQLException;

	List<Student> read() throws SQLException;

	Student read(Integer id) throws SQLException;

	void update(Student student) throws SQLException;

	void delete(Integer id) throws SQLException;

}