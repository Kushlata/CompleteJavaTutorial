package StringTutorial;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * url: https://www.youtube.com/watch?v=z5juCZzwMng&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=24
 * We need to display duplicate characters in the input String
 */

public class StringDuplicateCharactersString24 {

	public static void main(String[] args) {
		String x="SILLYSPIDERS";
		char[] y=x.toCharArray();
		int size=y.length;

		//Inserting Data in HashMap

		Map<Character,Integer> map=new LinkedHashMap<>();
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
			++i;
		}
		//Finding Duplicate characters, occurrence must be greater than 1.

		Set<Map.Entry<Character, Integer>> lmap=map.entrySet();
		for(Map.Entry<Character, Integer>data:lmap)
		{
			if(data.getValue()>1)
			{
				System.out.print(data.getKey());
				System.out.print("   "+data.getValue());
			}
			System.out.println();
		}
	}

}
