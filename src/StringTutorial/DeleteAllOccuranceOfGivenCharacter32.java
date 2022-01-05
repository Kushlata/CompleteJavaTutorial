package StringTutorial;
/*
 * URL: https://www.youtube.com/watch?v=P7a98xwv-9o&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=32
 * For e.g. (KEY: S)
 * Input String: SPIDERLIES
 * Output String: PIDERLIE
 * 
 */
public class DeleteAllOccuranceOfGivenCharacter32 {

	public static void main(String[] args) {
		String x="SPIDERLIES";
		char y[]=x.toCharArray();
		int size=y.length;

		String res="";
		char key='S';

		for(int i=0; i<size;i++) 
		{
			if(y[i]!= key) {
				res=res+y[i];
			}
		}
		System.out.print(res);
	}

}
