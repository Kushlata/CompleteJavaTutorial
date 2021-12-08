package StringTutorial;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * URl:https://www.youtube.com/watch?v=6K-m_bfqIMk&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=22
 */
public class StringFirstNonRepeatingCharacter22 {

	public static void main(String[] args) {

		String x="SILLYSPIDERS";
		char[] y=x.toCharArray();
		int size=y.length;

		//LinkedinHashmap to store data in order of their occurance
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
			i++;
		}
		//fetching the data
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey());
				System.exit(0);
			}
		}
	}

}
