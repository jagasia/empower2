import java.util.ArrayList;
import java.util.Scanner;

public class AppMock29Req2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Mobile Brand:");
		String name=sc.nextLine();
		MobileBrand mbrand=new MobileBrand(name,new ArrayList<>());
		do {			
			System.out.println("1.Add Mobile\r\n" + 
					"2.Delete Mobile\r\n" + 
					"3.Display Mobiles\r\n" + 
					"4.Exit\r\n" + 
					"Enter your choice:\r\n" + 
					"");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: //add
				String detail=sc.nextLine();
				if(detail.equals(""))
					detail=sc.nextLine();
				Mobile mobile = Mobile.createMobile(detail);
				mbrand.addMobileToMobileBrand(mobile);
				System.out.println("Mobile successfully added");
				break;
			case 2: //delete
				System.out.println("Enter the reference id of the mobile to be deleted:");
				String refId=sc.nextLine();
				if(refId.equals(""))
					refId=sc.nextLine();
				Boolean status = mbrand.removeMobileFromMobileBrand(refId);
				if(status)
				{
					System.out.println("Mobile successfully deleted");
				}else
				{
					System.out.println("Mobile not found in the Mobile Brand");
				}
				break;
			case 3: //display
				mbrand.displayMobiles();
				break;
			case 4:	//exit
				System.exit(0);
				break;
			}
			
		}while(true);
		
	}

}
