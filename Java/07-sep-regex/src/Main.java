import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//An employee id must be like E001
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		if(input.matches("E\\d{3}"))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
