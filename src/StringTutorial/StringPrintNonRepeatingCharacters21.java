package StringTutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Print all the non-repeating characters in the string
 * Url: https://www.youtube.com/watch?v=kj8vDQW_TBM&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=21
 */
public class StringPrintNonRepeatingCharacters21 {

	public static void main(String args[]) {

		String x="SILLYSPIDERS";
		char[] y=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> map=new HashMap<>();

		//Placing data in the Hashmap
		int i=0;

		while(i!=size)
		{
			if(map.containsKey(y[i])== false)
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
		//Fetching non-repeating characters
		Set<Map.Entry<Character, Integer>> hmap=map.entrySet();
		for(Map.Entry<Character,Integer>data:hmap) {

			if(data.getValue()==1)
			{
				System.out.println(data.getKey());
			}

		}


	}}
