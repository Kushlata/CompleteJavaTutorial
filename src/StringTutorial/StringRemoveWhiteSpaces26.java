package StringTutorial;

/*
 * Remove all white spaces from the input String
 * url: https://www.youtube.com/watch?v=8WkV08e__yA&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=26
 * 
 * space can be of two types:
 * 1. via space bar
 * 2. via tab button
 */
public class StringRemoveWhiteSpaces26 {

	public static void main(String[] args) {
	String x= "JOIN ABC		GET	PLACED		OR	REFUND MONEY";

	//x=x.replaceAll(" ", "");
	//Output: JOINABC		GET	PLACED		OR	REFUNDMONEY
	
	//x=x.replaceAll("\\t","")
	//Output: JOIN ABCGETPLACEDORREFUND MONEY-------- \t to remove tab
	
	x=x.replaceAll("\\s", "");
	//     \s is for whitespaces
	System.out.println(x);
	}

}
