package StringTutorial;

/*
 * Instead of using toCharArray(), we use charAt method to access individual elements in the string.
 * We are not converting string to character array, use CharAt() method.
 * 
 * This approach will save memory (no need to create array)
 */
public class StriingVerifyOnlyContainsIntergerWithCharAT11 {

	public static void main(String[] args) {
		String x="98097932";
		//String x="989AJGJG";

		int size=x.length();
		int i=0;
		while(i!=size)
		{
			if(x.charAt(i)>='0' && x.charAt(i)<='9')
			{
				i++;
			}
			else 
			{
				System.out.println("Not an Integer String");
				System.exit(0);
			}
		}
		System.out.println("Integer String");
	}

}
