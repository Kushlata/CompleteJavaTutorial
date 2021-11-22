package StringTutorial;

/*
 * URL: https://www.youtube.com/watch?v=9KUPWCXtKno&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=10
 * 
 * Case1: string with spaces (We need to apply a check for space)
 * Case2: need to change the case of only first letter
 */
public class StringCaseChangeWithBlankSpaces8 {
	public static void main(String args[])
	{	
	String x= "learning to get better";
	char y[]=x.toCharArray();
	int size= y.length;
	
	for(int i=0; i<size;i++)
	{
		if(y[i]!=' ') // This will check for spaces
		{
			y[i]=(char)(y[i]-32);
		}
	
}
	System.out.println(x);
	System.out.println(y);
}}
