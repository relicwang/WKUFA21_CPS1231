package selections;

import java.util.*;

//Purpose: Compute the shipping cost based the package
//           weight(double) given by user:
// 
//           w<=0    --->    show "invalid weight"
//           0<w<=2  --->    cost: 2.5
// 			 2<w<=4  --->    cost: 4.5
// 			 4<w<=10  --->   cost: 7.5
//           10<w<=20  --->  cost: 10.5
//           20<w      --->   show "package can't be shipped"
public class ComputeShippingCost {

	public static void main(String[] args) {
		//1. Get the weight from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the weight:");
		double weight = input.nextDouble();
		
		//2. Compute cost based on the weight:
		//      w<=0    --->    show "invalid weight"
		//      0<w<=2  --->    cost: 2.5
		//		2<w<=4  --->    cost: 4.5
		//		4<w<=10  --->   cost: 7.5
		//      10<w<=20  --->  cost: 10.5
		//      20<w      --->   show "package can't be shipped"
		if(weight<=0) {
			System.out.println("invalid weight");
		}
		else if(0<weight&&weight<=2) {
			System.out.println("The cost for package weight: "+weight+" is "+ 2.5);
		}
		else if(2<weight&&weight<=4) {
			System.out.println("The cost for package weight: "+weight+" is "+ 4.5);
		}
		else if(4<weight&&weight<=10) {
			System.out.println("The cost for package weight: "+weight+" is "+ 7.5);
		}
		else if(10<weight&&weight<=20) {
			System.out.println("The cost for package weight: "+weight+" is "+ 10.5);
		}
		else {
			System.out.println("package can't be shipped");
		}
		
		
	}

}
