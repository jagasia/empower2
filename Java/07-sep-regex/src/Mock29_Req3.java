import java.util.Scanner;

public class Mock29_Req3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String pattern="#[A-Z]{2,3}( [0-9]{2})? [A-Z0-9]{2,6}[-][0-9]{2,4}";
		if(input.matches(pattern))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
