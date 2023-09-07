import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(System.in);
		int i=bis.read();
		System.out.println(i);
	}

}
