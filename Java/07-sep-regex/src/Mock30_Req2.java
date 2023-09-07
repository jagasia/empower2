import java.util.Scanner;

public class Mock30_Req2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String pattern="[+]91[1-9][0-9]{9}";
		System.out.println(input.matches(pattern)?"Valid":"Invalid");
	}

}
