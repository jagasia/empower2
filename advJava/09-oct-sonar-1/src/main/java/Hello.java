import java.util.Date;

public class Hello {

	public static int sum(int i, int j)
	{
		int result=i+j;
		if(i<j)
		{
			result*=2;
		}
		else
		{
			result*=3;
		}
		return result;
	}
	public static void main(String[] args) {

		Date dt=new Date();
		dt=null;
		System.out.println(dt.toString());
		
	}

}
