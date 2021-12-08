package cp6_Method;

//Purpose: Computing the sum from begVal till endVal
//           using method
public class ComputeSumApplyMethod {

	public static void main(String[] args) {
		//Test Cases for sum method
		
		//1. Sum for only positive #s
		System.out.println(sum(1,1)  ==  1);
		System.out.println(sum(2,4)  ==  9);
		System.out.println(sum(100,200)  ==  ((100+200)*101/2));

		//2. Sum for only negative #s
		System.out.println(sum(-3,-2)  ==  -5);
		System.out.println(sum(-6,-3)  ==  -(3+4+5+6));
		System.out.println(sum(-1,-1)  ==  -1);

		
		
		//3. Sum for postive and negative #s
		System.out.println(sum(-8,9)  ==  9);
		System.out.println(sum(-3,2)  ==  -3);
		System.out.println(sum(-1,3)  ==  5);
		
		
		
		
	}
	
	//Signature: sum: int int --> int
	//Purpose:   Compute the sum from begVal till endVal
	//            and return the sum
	//Examples:   
	//           sum(1,1) -->1
	//           sum(2,4) -->9
	//           sum(-5,6)-->6
	public static int sum(int begVal, int endVal) {
		int sum = 0;
		
		for(int i=begVal;i<=endVal;i++) {
			sum+=i;
		}
		
		return sum;
	}
	

}
