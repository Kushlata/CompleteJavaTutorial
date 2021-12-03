package StringTutorial;

/*
 * C,C++ (old version): for loop, while & do-while loop
 * Java & C++(new version): for loop, while, do-while & for-each loop
 */
public class ForEachLoop {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		int sum=0;

		for(int data:a) //for each value of a
			// No need of increment, condition & inisilization

		{
			sum=sum+data;
		}

		System.out.println(sum);


	double b[]= {10.1,20.28, 30.98, 40.77, 50.67};
	double sum_b=0;
	for(double c:b)
	{
		sum_b=sum_b+c;
	}
	System.out.println(sum_b);
}
}