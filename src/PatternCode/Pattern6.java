package PatternCode;
/*
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
A B C D E F G 
A B C D E F G H 
A B C D E F G H I 
A B C D E F G H I J 
A B C D E F G H I J K 

*/

public class Pattern6 {

	public static void main(String[] args) {

		int alpha=65;
		for(int i=0; i<=10;i++)
		{
			for(int j=0;j<=i;j++)
			{
				//65+j=A: Type conversion
				System.out.print((char)(alpha+j)+" "); 
			}

			System.out.println();
		}

	}

}
