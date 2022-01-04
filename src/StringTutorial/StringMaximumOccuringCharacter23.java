package StringTutorial;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Url: https://www.youtube.com/watch?v=AI0j1LCkW8U&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=23&t=2s
 * We need to identify most occuring character in the input string
 */

public class StringMaximumOccuringCharacter23 {

	public static void main(String[] args) {
		String x="GOD_BLESS_SPIDERMAN";
		char[] y=x.toCharArray();
		int size=y.length;

		//Inserting Data in the LinkedHashMap
		Map<Character, Integer> map=new LinkedHashMap<>();
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
		
		//Extracting maximum occuring Character
		int maxval=0;
		char maxkey = 0;
		
		Set<Map.Entry<Character,Integer>> lhmap=map.entrySet();
		for(Map.Entry<Character, Integer>data:lhmap)
		{
			if(data.getValue()>maxval)
			{
				maxval=data.getValue();
				maxkey=data.getKey();
			}
			
		}
		System.out.print(maxkey);
		System.out.print("  "+maxval);
		
		


	}

}
