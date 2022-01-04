package StringTutorial;

/*
 * URL: https://www.youtube.com/watch?v=TbUYFwPYCO0&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=30
 */
public class StringCountNumberOfWords30 {

	public static void main(String[] args) {

		String x="This is my first java program";
		//We will use split method to split string from space & store it inside an array of type String
		
		String y[]=x.split(" ");
		System.out.print("Number of words in the string are: "+y.length);
		
	}

}
