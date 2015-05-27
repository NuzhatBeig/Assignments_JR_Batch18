package Operators;


public class BitWiseOpr {
	public static void main(String args[]) {
		
		int a = 5; // 4 + 0 + 1 or 0101 in binary 
		int b = 7; // 4 + 2 + 1 or 0111 in binary
		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		int f = (~a & b) | (a & ~b);
		int g = ~a & 0x0f; // 0x0f is the hexadecimal representation for 15
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	    System.out.println(g);
		
	}	
}
/*print to console will be in integer form since the variables are in int form.
variables are internally converted into binary and then operation is performed. The results are
printed to the console in int form again---is this logic correct..please let me know*/