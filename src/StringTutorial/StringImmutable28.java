package StringTutorial;
//To prove String is immutable
/*
 * Immutable Strings: are the strings which cannot be changed or altered. Not open for mutation.
 * Mutable Strings: Strings which can be change. Open for mutation.
 */

public class StringImmutable28 {

	public static void main(String[] args) {
		String x="ABC";
		String y="Test";
		x.concat(y);
		System.out.println(x);

		/*Output will be ABC, we tried to change the string, but it did not changed.Hence,
	     String is immutable.

	     To make String mutable:
	     - Don't use String Class
	     - Use StringBuffer or String Builder Class
		 */
		
		//Mutable Example 
		StringBuffer a=new StringBuffer("ABC");
		StringBuffer b=new StringBuffer("Tech");
		a.append(b);
		System.out.println(a);
		
	}
}