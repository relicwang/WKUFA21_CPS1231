package cp6_Method;

public class ComputeSumUsingMethod {

	public static void main(String[] args) {
		//Test Cases for sum method
		//1. Only 1 element
		System.out.println(sum(1,1)==1);
		System.out.println(sum(-5,-5)==-5);
		System.out.println(sum(0,0)==0);

		
		//2. 2 elements
		System.out.println(sum(2,3)==5);
		System.out.println(sum(-5,-4)==-9);
		System.out.println(sum(-1,0)==-1);
		
		
		//3. more than 2 elements
		System.out.println(sum(2,5)==14);
		System.out.println(sum(-5,-2)==-14);
		System.out.println(sum(-2,4)==7);
		
		
	}
	
	
	//Our Method
	
	//1. Signature: sum: int int -> int
	//2. Purpose:   Compute the sum begin with
	//       1st given integer till the 2nd given integer,
	//       return the integer.
	//3.Examples:
	//         sum(1,1) --> 1
	//         sum(2,5) --> 14
	//         sum(-3,-2) --->-5
	public static int sum(int begVal, int endVal) {
		int sum = 0;
		for(;begVal<=endVal;begVal++ ) {
			sum+=begVal;
		}
		
		return sum;
	}
	

}
