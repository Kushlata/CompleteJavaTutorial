package StringTutorial;

import java.util.Arrays;

public class StringAnagamSecondCase13 {
	//in this case we will check for string with spaces and in different case

	public static void main(String[] args) {

		String x="he is Tab";
		String y="iS He bat";

		//Replace blank space with empty string
		x=x.replace(" ","");
		y=y.replace(" ","");
		

		//Change case
		x=x.toLowerCase();
		y=y.toLowerCase();
		
		//store in character array
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result= Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("Anagam");
		}
		else
		{
			System.out.println("Non-Anagam");
		}
	}

}
