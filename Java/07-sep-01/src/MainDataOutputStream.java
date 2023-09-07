import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDataOutputStream {

	public static void main(String[] args) throws IOException {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("dadapeer.dat"));
		dos.writeInt(123);
		dos.writeFloat(12.2f);
		dos.writeChars("Dadapeer");
		dos.flush();
		dos.close();

	}

}
