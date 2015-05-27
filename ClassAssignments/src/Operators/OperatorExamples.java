package Operators;


public class OperatorExamples {
	 public static void main(String[] args) {
		int x= 20;
		int y=30;
		double z = 25;
		//Addition,subtraction,multiplication,division, modulus operator
		System.out.println("Addition : " +(x+y+z));
		System.out.println("Subtraction : " + ( x-y ));
		System.out.println("Multiplication : " + ( x*y ));
		System.out.println("Division : " + ( x/y ));
		System.out.println("Division : " + ( x/z ));
		System.out.println("Modulus : " + ( y%x ));
		System.out.println("Modulus : " + ( x%y ));
		
		System.out.println("========");
		
		int numOfDaysCount = 10;
	  System.out.println("numOfDaysCount " +    numOfDaysCount--);
		System.out.println("numOfDaysCount " + --numOfDaysCount);
		System.out.println("numOfDaysCount " + numOfDaysCount--);
		System.out.println("numOfDaysCount " + numOfDaysCount--);
	
		
	/*	System.out.println("numOfDaysCount " + --numOfDaysCount);
		System.out.println("numOfDaysCount " + --numOfDaysCount);
		System.out.println("numOfDaysCount " +  numOfDaysCount--);
		System.out.println("numOfDaysCount " +  --numOfDaysCount);
		//numOfDaysCount-=5;
		//numOfDaysCount+=4;
		//numOfDaysCount*=4;
		//numOfDaysCount/=4;
		numOfDaysCount%=6;
		System.out.println("numOfDaysCount " +  numOfDaysCount);
	*/	
	}
}
