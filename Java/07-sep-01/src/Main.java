import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc1=new Scanner(System.in);
		Scanner sc=new Scanner(new File("skanda.txt"));
		int no=sc.nextInt();
		String str=sc.next();
		System.out.println(no);
		System.out.println(str);
	}

}
