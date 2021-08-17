package CoreJava;

public class LoopsConcept {

	//1. while Loop
	//dis-advantage: it will generate infinite loop if you don't give the incremental/decremental part
	{
		int i=1;//initializing
		while(i<=10)  //Conditional part
		{
			System.out.println(i);
			i=i+1; //incremental/decremental
		}

		System.out.println("***********************");
		//j++ means j+1

		//2. For loop
		for(int j=1; j<=10; j++) { //Initialization, Condition, Incremental/decremental
			System.out.println(j);
		}
	}
}