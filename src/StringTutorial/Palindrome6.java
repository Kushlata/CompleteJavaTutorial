package StringTutorial;
//Two strings: too hot to hoot, too Hot to Hoot
// We need to handle spaces and case sensitive data for palindrome
/*
 * Step1: Remove empty spaces via use of inbuilt method: replace()
 * we need to replace blank space with empty string: x.replce(" ","")  
 * This will handle the space issue
 * 
 * Step2: Convert complete string either into uppercase or in lowercase with the use of 
 * inbuilt method. toLowercase(), toUpperCase()
 * 
 */

public class Palindrome6 {

	public static void main(String[] args) {

		String x=new String("too Hot to Hoot");
		x=x.replace(" ","");
		x=x.toLowerCase();
		
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char[size];
		
		for(int i=0;i<size;i++) 
		{
			a[i]=y[size-i-1];
		
	}
		int i=0;
		while(i!=size)
		{ 
			if(a[i]!=y[i])
			{
				System.out.print("Not a palindrome");
				System.exit(0);
			}
			else
			{
				++i;
				continue;
			}
		}
		System.out.println("Palindrome");
	}

}
