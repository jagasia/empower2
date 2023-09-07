import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainOOS {

	public static void main(String[] args) throws IOException{
		Employee e=new Employee();
		e.setId(1234);
		e.setFirstName("Chenna");
		e.setLastName("Kesava Reddy");
		e.setSalary(123456.78);
		e.age=22;
		
		FileOutputStream fos=new FileOutputStream("dhiraj.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.flush();
		oos.close();
		
	}

}
