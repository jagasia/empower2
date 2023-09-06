import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> countryMap=new HashMap<>();
		countryMap.put(12, "Bangladesh");
		countryMap.put(7, "China");
		countryMap.put(null, "Pakistan");
		countryMap.put(9, "Srilanka");
		countryMap.put(null, "Nepal");
		countryMap.put(6, "Bhutan");
		countryMap.put(7, "Japan");
		
		
		for(Entry<Integer, String> e:countryMap.entrySet())
		{
			System.out.println(e);
		}
		
	}

}
