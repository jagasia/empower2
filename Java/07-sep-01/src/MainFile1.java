import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		C:\Users\rjaga\Pictures\briyani1.jfif
		File f=new File("C:\\Users\\rjaga\\Pictures\\briyani1.jfif");
		FileInputStream fis=new FileInputStream(f);
		long len = f.length();
		System.out.println("there are "+len+" bytes in that file");
		byte data[]=new byte[(int) len];
		
		fis.read(data);
		fis.close();
		//read process is over
		
		FileOutputStream fos=new FileOutputStream(new File("komal.jfif"));
		fos.write(data);
		fos.flush();
		fos.close();
		System.out.println("Done");

	}

}
