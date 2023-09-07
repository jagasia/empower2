import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainFile2 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\rjaga\\\\Pictures\\\\briyani1.jfif");
		FileOutputStream fos=new FileOutputStream("chenna.jfif");
		int data=-1;
		while((data=fis.read())!=-1)
		{
			fos.write(data);
			Thread.sleep(10);
			fos.flush();
		}
		System.out.println("done");
	}

}
