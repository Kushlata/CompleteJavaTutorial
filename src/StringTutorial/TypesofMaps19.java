package StringTutorial;
/*
 * URl: https://www.youtube.com/watch?v=4kIJvSsexMM&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=19
 * 
 * Three types of Map: HashMap, LinkedHashMap, TreeMap
 * Data sequence is not maintained in HashMap, if wanted a proper sequence, use LinkedHashMap.
 * 
 * HashMap: stores the data in Random order (based on a Hash Function)
 * LinkedHashMap: stores the data in same sequence as the input
 * TreeMap: stores the data in the Ascending order.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TypesofMaps19 {

	public static void main(String[] args) {

		//Declaring Hashmap: Key as Character & value as a Integer
		//Map<Character,Integer> map=new HashMap<>();

		//Declaring LinkedHashmap: Key as Character & value as a Integer
		Map<Character,Integer> map=new LinkedHashMap<>();

		//Declaring TreeHashmap: Key as Character & value as a Integer
		//Map<Character,Integer> map =new TreeMap<>();

		
		String s="life_is_beautiful";
		char y[]=s.toCharArray();
		
		int size=y.length;
		
		int i=0;
		for(i=0; i<size;i++) {
			
			if(map.containsKey(y[i])== false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldval=map.get(y[i]);
				System.out.println(oldval);
				int newcount=oldval+1;
				map.put(y[i], newcount);
			}
		}
		
		//Printing complete data
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap)
		{
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
	}

}
