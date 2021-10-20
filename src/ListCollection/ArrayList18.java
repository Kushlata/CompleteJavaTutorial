package ListCollection;

import java.util.ArrayList;
import java.util.Iterator;

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
		
		
		//We can also store user defined class objects in arrayList
		//Employee Class Object
		Employee E1=new Employee("Tom",27,"IT");
		Employee E2=new Employee("Harry",26,"User");
		Employee E3=new Employee("Peter",29,"Admin");
		
		//*interview question
		//Create ArrayList
		ArrayList<Employee> ar5=new ArrayList<Employee>(); //generic is user defined class type
		ar5.add(E1);
		ar5.add(E2);
		ar5.add(E3);
		
		//iterator to traverse the values. 
		//iterator method comes from java.util package
		//we cannot use for loop with iterator as its doesn't work with the indexes
		
		Iterator<Employee> it=ar5.iterator();
		while(it.hasNext()){//if next value is available
		Employee emp=it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		
		}
		
		//*************************
		//addAll(): method to add arraylist2 to arrayist1 (merge operation)
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("Hello");
		ar6.add("World");
		ar6.add("selenium");
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("Life");
		ar7.add("selenium");
		ar7.add("wonderful");
		
		ar6.addAll(ar7);
		
		for(int i=0; i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
		
		//removeAll(): method to remove all the elements. Remove arrylist2 from arraylist1
		
		ar6.removeAll(ar7);
		System.out.println("*********************");
		for(int i=0; i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
		

		
		//retainAll(): method to find common content.  intersection operation
		
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("test");
		ar8.add("test1");
		ar8.add("test2");
		
		ArrayList<String> ar9=new ArrayList<String>();
		ar9.add("test");
		ar9.add("test3");
		ar9.add("test4");
		
		System.out.println("*********************");
		ar8.retainAll(ar9);
		for(int i=0; i<ar8.size();i++) {
			System.out.println(ar8.get(i));
		}
		
		
	}

}
