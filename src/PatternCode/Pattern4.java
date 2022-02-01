package PatternCode;
/*
     *
    **
   ***
  ****
 *****
 
 */
public class Pattern4 {

	public static void main(String[] args) {
		for(int i=0; i<=4;i++) {

			//Loop for blank spaces
			for(int j=4; j>=i;j--)
			{
				System.out.print(" ");
			}
			//Loop for printing pattern
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}	
			System.out.println();
		}
	}
}
