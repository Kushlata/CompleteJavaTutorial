package StringTutorial;

public class LengthofString3 {

	/* Two main challengesin java
	 * No direct access to data
	 * No ending with null '\0'
	 */
	public static void main(String[] args) {
		//Length of String without using inbuilt method
		//https://www.youtube.com/watch?v=7JrtfImfId0&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=3

		String x="Hello World";

		//1. Problem: Concatenate null character at the end to find the string ending
		x=x.concat("\0");

		//2. Problem: convert string to character of array

		char y[]=x.toCharArray();

		int count=0;
		int i=0;
		while(y[i]!='\0')
		{
			++count;
			++i;
		}
		System.out.println(count);
		
		//inbuilt method:length()
		System.out.print(x.length());
	}

}
