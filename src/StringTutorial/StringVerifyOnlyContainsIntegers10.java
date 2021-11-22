package StringTutorial;
//To verify that input string contains only integers

public class StringVerifyOnlyContainsIntegers10 {

	public static void main(String[] args) {
		//String x="987675";
		String x="986ABC";
		char y[]=x.toCharArray();

		int size=y.length;

		for(int i=0; i<size;i++) 
		{
			if (y[i]>='0' && y[i] <='9')
			{
				
			}
			else
			{
				System.out.println("Not a integer String");
				System.exit(0);
			}
			
		}
		System.out.print("Integer String");
	}

}
