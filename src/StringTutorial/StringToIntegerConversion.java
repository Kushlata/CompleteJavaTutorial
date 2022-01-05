package StringTutorial;

public class StringToIntegerConversion {

	public static void main(String[] args) {
		int x=66;
		String z="67";
		
		//Converting integer to String
		String y= Integer.toString(x);
		System.out.println(y);

		//Converting String to Integer
		int i=Integer.parseInt(z);
		System.out.print(i);
	}

}
