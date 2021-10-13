package ListCollection;

import java.util.ArrayList;

public class ArrayList18 {

	public static void main(String[] args) {

		//static array: size is fixed. we can't store more values than 3, it will give you 
		//array out of bound exception.
		int a[]=new int[3]; 

		//Dynamic array: size doesn't matter(ArrayList)
		//1. can contain duplicate values/elements (not in Hashtable)
		//2. maintain insertion order
		//3. Not Synchronized. Hence, slow as compared to other collections
		//4. allow random access to fetch the element because it stores the values on the basis of index.


		ArrayList ar=new ArrayList(); 

		//ArrayList is a class comes from java.util package
		ar.add(10); //0
		ar.add(20.56); //1
		ar.add("Hello"); //2

		//Size of the arrayList: object.size() method.

		System.out.println(ar.size());
		System.out.println(ar.get(1)); // to get a value from a index

		//To print all the values from arrayList:
		//1. For loop
		//2. using iterator

		for(int i=0; i<ar.size();i++)
			System.out.println(ar.get(i));

		//generic vs. non-generic
		/*
		 * Before jdk 1.5, defining generic was not required. Generic means we need to define
		 * the data type we are going to store in the arrayList. yellow waring sing is appearing due to this.
		 */

		ArrayList<Integer> ar1=new ArrayList<Integer>(); //<Integer>=generic
		//we need to use the wrapper class
		
		ar1.add(100);
		//ar1.add("selenium"); it will show error, as it only accepts integer.
		
		ArrayList<String> ar2=new ArrayList<String>(); //String
		ar2.add("test1");
		ar2.add("test2");
		
	}

}
