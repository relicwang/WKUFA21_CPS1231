package cp4_MathFuncts;

import java.util.*;

//Purpose: Given the boundary: [5,26], when user number
//          is inside range, return itself;
//          Otherwise, return the closest boundary.
//          e.g.  if user value = 10, ---> print 10
//        		  if user value = 50, ---> print 26
//                if user value = -5, ---> print 5

public class NumberBoundary {

	public static void main(String[] args) {
		//1.Get a number from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a numnber:");
		
		double num = input.nextDouble();
		
		
		//2.Conduct the comparasion and print the result
		final double LOWER = 5;
		final double UPPER = 26;

		
		double result =   Math.min(UPPER,
				                   Math.max(num, LOWER));
		
		System.out.println("The result is : "+ result);
	}

}
