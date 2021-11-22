package StringTutorial;
//https://www.youtube.com/watch?v=XAdrCoky0RY&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=11&t=19s

public class StringCaseChangeFirstLetterCap9 {

	public static void main(String[] args) {
		String x="learning to get better";
		char y[]=x.toCharArray();
		int size=y.length;

		y[0]=(char)(y[0]-32); //Uppercase first letter at 0th location
		int i=1; //start traversing from 1 index as 0th record already updated

		while(i!= size)
		{
			if(y[i]==' ')
			{		y[i+1]=(char)(y[i+1]-32); //change next character after space to uppercase

			}
			++i;
		}
		System.out.println(x);
		System.out.println(y);
	}
}