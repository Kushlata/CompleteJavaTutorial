package StringTutorial;

//https://www.youtube.com/watch?v=0OMwlxqzY4k&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=12

public class ConsonantsVowelsSpecialCount10 {

	public static void main(String[] args) {
		String x="SPEND TWO HOUR'S FOR SELF STUDY";
		char y[]=x.toCharArray();
		int size=y.length;

		int vowcount=0;
		int conscount=0;
		int spslcount=0;

		int i=0;
		for(i=0; i<size;i++)
		{
			if(y[i]>='A' && y[i]<='Z')
			{ 
				if(y[i]=='A'||y[i]=='E'||y[i]=='O'||y[i]=='I'||y[i]=='U')
				{ 
					++vowcount;
				}

				++conscount;
			}
			else
			{
				++spslcount; 
			}
		}
		System.out.println("Input String: "+x);
		System.out.println("vowles count: "+vowcount);
		System.out.println("Consonant Count: "+conscount);
		System.out.println("Special Character and space count: "+spslcount);
	}

}
