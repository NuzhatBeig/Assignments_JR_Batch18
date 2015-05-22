
public class BooleinLogicalOperators {
	
	public static void main(String[] args) {
		int urAge =15; //21
		int myAge =21; //15
		
		 boolean chkCondition = ((urAge > 20) & (myAge >20));
		//boolean chkCondition =  ((urAge > 20) && (myAge >20));
	    //boolean chkCondition =  ((urAge > 20) | (myAge >20));
		//boolean chkCondition =  ((urAge > 20) || (myAge >20));
		
		String message = chkCondition ? " We are adults " : " We are not ";
		
		System.out.println(message);
	}
	

}
