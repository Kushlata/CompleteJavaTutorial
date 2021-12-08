package StringTutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Url: https://www.youtube.com/watch?v=PqSZVIP8tBI&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=20
 * 
 * 
 */
public class StringContainsUniqueCharacters20 {

	public static void main(String[] args) {

		//String x="SPIDERMAN"; 
		String x="SILLYSPIDERS";
		char[] y=x.toCharArray();
		int size=x.length();

		Map<Character,Integer> map=new HashMap<>();
		int i=0;

		//Placing data inside the map
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else {

				int oldval=map.get(y[i]);
				int newval=oldval+1;
				map.put(y[i], newval);
			}
			++i;
		}

		//verifying whether each data present only once

		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()>1)
			{
				System.out.print("Doesn't contain unique values: "+x);
				System.exit(0);
			}

		}
		System.out.println("Have All unique values: "+x);	

	}
}