import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import org.h2.jdbc.JdbcSQLSyntaxErrorException;

import org.h2.jdbc.JdbcSQLSyntaxErrorException;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		StudentDao sdao=new StudentDaoImpl();
		try
		{
			sdao.createTable();
			System.out.println("Table created");
		}catch(JdbcSQLSyntaxErrorException ex)
		{
			System.out.println("Table already exists");
		}
		
		int choice=0;
		Integer id=0;
		String name="";
		String address="";
		String phone="";
		Student student=null;
		do
		{
			System.out.println("1) Add a student\r\n" + 
					"2) Display All students\r\n" + 
					"3) Find student by id\r\n" + 
					"4) Update a student\r\n" + 
					"5) Delete a student\r\n" + 
					"6) Exit\r\n" + 
					"");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:		//add
				System.out.println("Id:");
				id=sc.nextInt();
				System.out.println("Name:");
				name=sc.nextLine();
				if(name.equals(""))
					name=sc.nextLine();
				System.out.println("Address:");
				address=sc.nextLine();
				System.out.println("Phone:");
				phone=sc.nextLine();
				student=new Student(id, name, address, phone);
				sdao.create(student);
				break;
			case 2: 	//display all
				List<Student> students = sdao.read();
				System.out.printf("%3s\t%20s\t%20s\t%15s\n","Id","Name","Address","Phone");
				for(Student s:students)
				{
					System.out.printf("%3s\t%20s\t%20s\t%15s\n",s.getId(),s.getName(),s.getAddress(),s.getPhone());
				}
				break;
			case 3:		//find by id
				System.out.println("Id:");
				id=sc.nextInt();
				student=sdao.read(id);
				if(student!=null)
				{
					System.out.printf("%3s\t%20s\t%20s\t%15s\n","Id","Name","Address","Phone");
					System.out.printf("%3s\t%20s\t%20s\t%15s\n",student.getId(),student.getName(),student.getAddress(),student.getPhone());
				}else
				{
					System.out.println("No student found for the given id");
				}
				break;
			case 4:		//update
				System.out.println("Id:");
				id=sc.nextInt();
				System.out.println("Name:");
				name=sc.nextLine();
				if(name.equals(""))
					name=sc.nextLine();
				System.out.println("Address:");
				address=sc.nextLine();
				System.out.println("Phone:");
				phone=sc.nextLine();
				student=new Student(id, name, address, phone);
				sdao.update(student);
				break;
			case 5:		//delete
				System.out.println("Id:");
				id=sc.nextInt();
				sdao.delete(id);
				break;
			default:
				System.exit(0);
			}
		}while(true);
	}

}
