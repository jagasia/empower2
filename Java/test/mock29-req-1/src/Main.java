import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile 1 detail:");
		String detail1=sc.nextLine();
		System.out.println("Enter mobile 2 detail:");
		String detail2=sc.nextLine();
		String[] arr1 = detail1.split(",");
		Mobile mobile1=new Mobile();
//		#SM 45 JJ6-001,Galaxy J6,5.6,13990,02-01-2017
		mobile1.setReferenceId(arr1[0]);
		mobile1.setModelName(arr1[1]);
		mobile1.setDisplaySize(Double.parseDouble(arr1[2]));
		mobile1.setPrice(Double.parseDouble(arr1[3]));
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		mobile1.setLaunchedDate(sdf.parse(arr1[4]));
		
		String[] arr2 = detail2.split(",");
		Mobile mobile2=new Mobile();
		mobile2.setReferenceId(arr2[0]);
		mobile2.setModelName(arr2[1]);
		mobile2.setDisplaySize(Double.parseDouble(arr2[2]));
		mobile2.setPrice(Double.parseDouble(arr2[3]));
		mobile2.setLaunchedDate(sdf.parse(arr2[4]));
		
		System.out.println("Mobile 1");
		System.out.println(mobile1);
		System.out.println();
		System.out.println("Mobile 2");
		System.out.println(mobile2);
		
		if(mobile1.equals(mobile2))
		{
			System.out.println("Mobile 1 is same as Mobile 2");
		}else
		{
			System.out.println("Mobile 1 and Mobile 2 are different");
		}
		
	}

}
