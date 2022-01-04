package StringTutorial;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Url: https://www.youtube.com/watch?v=zPOCpLqCrMs&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=25
 * 
 * If input have 3S, 2I & 2L. Then, output should have 1S, 1I & 1L.
 * Logic: we need to only print the keys, as they are unique
 */

public class StringRemoveDuplicateCharcters25 {

	public static void main(String[] args) {
		String x="SILLYSPIDERS";
		char[] y=x.toCharArray();
		int size=y.length;

		//Inserting data inside the map. Using LinkedHashmap to maintain sequence
		Map<Character,Integer>map=new LinkedHashMap<>();
		int i=0;

		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldval=map.get(y[i]);
				int newval=oldval+1;
				map.put(y[i], newval);
			}
			i++;
		}
		//Printing keys, to remove duplicate values

		String result=""; //creating empty string

		Set<Map.Entry<Character,Integer>> lhmap=map.entrySet();

		for(Map.Entry<Character, Integer>data:lhmap)
		{
			result=	result+data.getKey();
		}

		System.out.print(result);
	}

}
