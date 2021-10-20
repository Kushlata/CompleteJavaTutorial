package StringTutorial;

public class String2 {

	//https://www.youtube.com/playlist?list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN
	
	/* String in C: is a array of charcters ending with null 
	 * 
	 * String in Java: it treats string as object. Strings i  java is not considered as a array of charcters.
	 *                 Hence, it have data and methods like: toUpperCase(),
	 *                 toLowercase(), toequals(), compareTo(), charAt() etc.
	 *                 
	 *                 String should be enclosed in double quotes.
	 * 
	 */
	public static void main(String[] args) {
		//To print specific character at certain position, use charAt() method
		String x="Hello world";
		
		System.out.println(x.charAt(8));

	}

}
