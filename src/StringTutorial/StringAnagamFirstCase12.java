package StringTutorial;

import java.util.Arrays;

//url: https://www.youtube.com/watch?v=oa0wxvoZPDI&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=14
/*
 * To verify that input string is an anagram
 * Anagram example: SILENT & LISTEN, BRAINY & BINARY 
 * 
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase
 * 
 * step1: sort the data in strings
 * step2: Compare the sorted data
 * 
 * if sorted arrays are same, than it means anagram.
 * 
 */
public class StringAnagamFirstCase12 {

	public static void main(String[] args) {
		String x="BINARY";
		String y="BRAINY";

		char a[]=x.toCharArray(); // storing in char array
		char b[]=y.toCharArray();

		Arrays.sort(a); //ABINRY
		Arrays.sort(b); //ABINRY

		Boolean result=Arrays.equals(a,b);

		if(result==true)
		{
			System.out.println("Anagam");
		}

		else
			System.out.println("non-anagam");
	}

}
