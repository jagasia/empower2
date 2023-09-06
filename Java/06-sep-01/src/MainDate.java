import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MainDate {

	public static void main(String[] args) throws ParseException {
		Date dt=new Date();
		String str1="24-Oct-2023";
		//how to convert String into Date?
		SimpleDateFormat sdf2=new SimpleDateFormat("dd-MMM-yyyy");
		dt=sdf2.parse(str1);
//		System.out.println(dt); 		//Wed Sep 06 15:37:37 IST 2023
//		System.out.println(dt.getMonth());
//		System.out.println(dt.getYear());
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		String str = sdf.format(dt);
		int year=Integer.parseInt(str);
		System.out.println(year);
		
		sdf=new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(dt));

		System.out.println(Arrays.toString(dt.toString().split(" ")));
	}

}
