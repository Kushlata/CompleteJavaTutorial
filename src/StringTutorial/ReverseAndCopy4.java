package StringTutorial;

//Copying a string, reverse the string and then verifying its a palandrome or not

/* 1. Creating a string object with x as reference
 * 2. Extract the data from string object and place it in a character array y
 * 3. Compute length of y
 * 4. Create a new array with its size same as y
 * 5. Create an index variable i and initialize to 0
 * 6. copy the data from y array to new array (4)
 * 7. Print the result
 * 
 * Palandrome e.g. REFER, RADAR, CIVIC, LEVEL, RACECAR
 * 
 */
public class ReverseAndCopy4 {

	public static void main(String[] args) {
		String x="Hello World";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char[size];

		int i = 0;
		//Reverse String
		while(i!=size) {
			//a[i]=y[i]; ---- for copy string
			a[size-1-i]=y[i];
			i++;
		}
		System.out.println(a);
		System.out.println(y);
	}
	}
