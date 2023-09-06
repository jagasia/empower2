import java.util.Set;
import java.util.TreeSet;

public class App2 {

	public static void main(String[] args) {
		Set<String> countries=new TreeSet<String>();
		countries.add("India");
		countries.add("Bharath");
		countries.add("Japan");
		countries.add("China");
		countries.add("Taiwan");
		countries.add("South Korea");
		countries.add("Srilanka");
		countries.add("China");
		countries.add("Pakistan");
		countries.add("Thailand");
		countries.add("Bangladesh");
		
		for(String c : countries)
		{
			System.out.println(c);
		}
	}

}
