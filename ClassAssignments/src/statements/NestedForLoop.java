package statements;

public class NestedForLoop {
	public static void main(String[] args) {
	  int i;
	  int j;
	 /* for(i = 0 ; i < 10; i++){
		  
		  System.out.print(" \nOuter loop is : " + i);
		  for(j = 0 ; j < i ; j++){
			  if (j == 5 )continue;
			  //if(j == 5) break;
			  System.out.print(" Inner loop is:  " + j);
		  }
	  }
	  */
	 
 for(i = 0 ; i < 10; i++){
		  if( i == 8) break;
		  System.out.print(" \nOuter loop is : " + i);
		  for(j = 0 ; j <= i ; j++){
			  //if (j == 5 )continue;
			  if(j == 5) break;
			  System.out.print(" Inner loop is:  " + j);
		  }
	  System.out.println("\nThis is the end");
	  }


}
}
