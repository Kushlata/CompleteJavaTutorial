package StringTutorial;
//Consider 2 strings: Liril & India
//This code will not hadle spaces and case sensitive data

public class Palindrome5 {

	public static void main(String[] args) {

		String x="LiriL";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char[size];

		int i=0;
		while(i!=size)
		{
			a[size-1-i]=y[i];
			++i;
		}
		i=0;
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
