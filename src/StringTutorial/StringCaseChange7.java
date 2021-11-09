package StringTutorial;
//url: https://www.youtube.com/watch?v=lq5dfplnibE&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=9
/*
 * ASCII code need to be  know for this conversion
 * A=65, a=97
 * lowercase(a)=uppercase(A)+32
 * 
 */

public class StringCaseChange7 {

	public static void main(String[] args) {

		String x="learning";
	char y[]=x.toCharArray();
	int size=y.length;
	
	for(int i=0; i<size; i++)
	{
		y[i]=(char)(y[i]-32); //char is used to get charcter value of ascii code
	}
	System.out.println(x);
	System.out.println(y);
	}

}
