import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MainDataInputStream {

	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(new FileInputStream("dadapeer.dat"));
		
		float f=dis.readFloat();
		int i=dis.readInt();
		String str=dis.readLine();
		System.out.println(i);
		System.out.println(f);
		System.out.println(str);
		
	}

}
