package StringTutorial;

/* URL:https://www.youtube.com/watch?v=MVNKhuZxxaQ&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=29
 * Rather than swapping the string, we will swap the string reference variable
 */
public class SwapTwoStrings29 {

	public static void main(String[] args) {
		String x="ABC";
		String y="test";

		//Using 3rd variable
		String temp="";

		System.out.println("String x before swaping:"+x);
		System.out.println("String y before swaping:"+y);

		temp=x;
		x=y;
		y=temp;
		
		System.out.println("String x after swapping:"+x);
		System.out.println("String y after swaping:"+y);
	}

}
