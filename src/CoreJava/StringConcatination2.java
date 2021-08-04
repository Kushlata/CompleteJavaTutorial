package CoreJava;

public class StringConcatination2 {


		public static void main(String[] args) {
			//+: is a concatenation operator
			//println: is used to print on the console
			//it works in a combination of 1 & 2. For example:
			//1. 1 & 2 is int it will sum them and give int as output
			//2. 1 is int & 2 is string, it will give string as result.
			//Whenever a new value comes, it check with the 1 & 2 combinations
			
			int a=100;
			int b=200;
			
			String x="Hello";
			String y="World";
			
			double c=2.5;
			double d=3.5;
			
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);

		}

	}

