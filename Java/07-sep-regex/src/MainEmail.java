import java.util.Scanner;

public class MainEmail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		//check if this email is valid
		String pattern="([A-Za-z0-9])+([.][A-Za-z0-9]+){0,1}@[A-Za-z0-9]+[.](([a-zA-Z]{3})|([a-zA-Z]{2}[.][a-zA-Z]{2}))";
		System.out.println(email.matches(pattern)?"Valid":"Invalid");
	}

}
