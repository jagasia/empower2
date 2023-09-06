import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		char[] arr = input.toCharArray();
		
		Map<Character, Integer> map=new LinkedHashMap<>();
		for(char c:arr)
		{
			Integer value = map.get(c);
			if(value==null)
			{
				value=0;
			}
			value++;
			map.put(c, value);
		}
		
		for(Entry<Character, Integer> e:map.entrySet())
			System.out.println(e);
	}

}
