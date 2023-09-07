import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of mobiles:");
		int noOfMobiles=sc.nextInt();
		List<Mobile> mobileList=new ArrayList<Mobile>();
		for(int i=0;i<noOfMobiles;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			Mobile mobile=Mobile.createMobile(detail);
			mobileList.add(mobile);
		}
		
		System.out.println("Enter a type to sort:\r\n" + 
				"1.Sort by price\r\n" + 
				"2.Sort by launched date\r\n" + 
				"");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: //sort by price
			Collections.sort(mobileList);
			break;
		case 2:	//sort by launched date
//			LaunchedDateComparator ldc=new LaunchedDateComparator();
//			Collections.sort(mobileList, ldc);
			Collections.sort(mobileList,new LaunchedDateComparator());
			break;
		}
		
		//display
		System.out.format("%-15s %-15s %-12s %-8s %s\n","Reference Id","Model Name","Display Size","Price","Launched Date");
		for(Mobile m : mobileList)
			System.out.format("%-15s %-15s %-12s %-8s %s\n",m.getReferenceId(),m.getModelName(),m.getDisplaySize(),m.getPrice(),m.getLaunchedDate1());
	}

}
