package cp6_Method;

//Purpose: Compute two numbers
//           and find the min and max value
public class ComputeMinMax {

	public static void main(String[] args) {
		//Test cases for min(): int int
		
		//1. #1==#2
		/*
		 * System.out.println(min(1,1)==1); System.out.println(min(-3,-3)==-3);
		 * System.out.println(min(0,0)==0);
		 * 
		 * //2. #1<#2 System.out.println(min(2,3)==2);
		 * System.out.println(min(-1,1)==-1); System.out.println(min(-2,-1)==-2);
		 * 
		 * 
		 * //3. #1>#2 System.out.println(min(7,3)==3);
		 * System.out.println(min(99,-3)==-3); System.out.println(min(-1,-7)==-7);
		 */
		 
		//Test cases for min(): int int int
		
		//1. 3 #s are equal
		System.out.println(min(1,1,1)==1);
		System.out.println(min(-5,-5,-5)==-5);

		//2. #1>#2>#3
		System.out.println(min(7,5,2)==2);
		System.out.println(min(99,2,-2)==-2);
		System.out.println(min(65,-2,-7)==-7);

		
		
		//3. #1>#3>#2
		
		//4. #2>#1>#3
		
		//5. #2>#3>#1
		
		//6. #3>#1>#2
		
		//7. #3>#2>#1
		
		//8. #1=#2
		//    a. #3>#1
		
		//    b. #3<#1
		
		//9. #1=#3
		//    a. #2>#1
		
		//    b. #2<#1
		
		//10. #2=#3
		//     a. #1>#2
		
		
		//     b. #1<#2

		 
		min(1,2)//min: int int
		
		min(1,3,5)
		 
	}
	
	//Signature: min: int int -> int 
	//Purpose:  Compare two numbers and return`ler
	//Examples:
	//          min(1,5) ->1
	//          min(-100,500)->-100
	//Method Header
	public static int min(int num1, int num2) {
		
		if(num1>num2) {
			return num2;
		}
		else {
			return num1;
		}
		
	}
	
	
	//Signature:  min: int int int -> int
	//Purpose:  Compare three numbers and return 
	//            the smallest one
	//Examples:
	//           min(1,1,1) -->1
	//           min(2,1,3) -->1
	//           min(-9,1,2) -->-9
	public static int min(int num1, int num2, int num3) {
		return min(min(num1,num2),num3);
	
	}
	
	
	
	
	

}
