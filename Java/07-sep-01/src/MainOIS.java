import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainOIS {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("dhiraj.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee) ois.readObject();
		System.out.println(emp.getFirstName());
		System.out.println(emp.getSalary());
		System.out.println(emp.age);
		
	}

}
