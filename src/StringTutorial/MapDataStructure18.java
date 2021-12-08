package StringTutorial;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* URL: https://www.youtube.com/watch?v=oZ7LymkbmiA&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=17
 * 
 * Map: is a type of Data Structure. Data stored in a key value pair.
 * Different Types of Maps: HashMap, TreeMap & LinkedHashMap
 * 
 * Key, value
 * A   3
 * R   1
 * D   1
 * Y   1
 * H   1
 * 
 * Map<character,Integer>map= new HashMap();
 * Key--character & value -- integer
 * 
 * put()-- to add data & get()-- to fetch data
 * 
 * 
 * Properties:
 * 1. Keys must be unique
 * 2. Value: need not to be unique
 * 
 * getKey(): to get key value
 * getValue(): to get value for that key
 */
public class MapDataStructure18 {

	public static void main(String[] args) {

		String s="Elephant";
		char y[]=s.toCharArray();
		int size=s.length();

		//Declaring map variable: Hashmap  doesn't match sequence, for sequence to match use LinkedHashMap
		//Map<Character,Integer> map=new HashMap<>();
		
		Map<Character, Integer> map=new LinkedHashMap<>();

		//Pushing Data in Map table
		int i=0;
		while(i!=size)
		{
			//If value not there in Map
			if(map.containsKey(y[i])== false)
			{
				map.put(y[i], 1);
			}
			//If key already present, then increase the count of value
			else
			{
				int oldval=map.get(y[i]);
				int newval=oldval+1;
				map.put(y[i], newval);
			}
			++i;
		}
		
		//Printing Data, use for each loop
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data: hmap)
		{
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
		
	}

}
