package StringTutorial;

/*
 * To verify input string is empty or not
 * url: https://www.youtube.com/watch?v=W7W8IATz_U4&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=27
 * 
 * String a="ABC";
 * String b=" ";
 * String c="";
 * String d=null; //its not a string as it must be enclosed in double quote
 * 
 * Out of these 4 only c is the empty String.
 * Empty string is a string, whose length is zero.
 */
public class VerifyStringEmptyorNot27 {

	public static void main(String[] args) {
		String x="";
		int size=x.length();
		if(size==0)
		{
			System.out.println("Input String is empty");
		}

		else
		{
			System.out.println("Input String is not empty");
		}
	}

}
