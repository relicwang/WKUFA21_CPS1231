package finalExamReview;

import java.util.Scanner;

//Purpose: Reivew the materials we covered during the
//    while semester
public class Review {

	public static void main(String[] args) {
		//1. Fundamental Program Knowledge
		System.out.println("Welcome to CPS 1231");
		
		//Variable 
//		int i =0;
		double j=9.7;
//		i=100;
		
		//int/int ---> int
		// In math: 3/2 --> 1.5
		// Java Persepctice£º 
		int num1 =3;
		int num2 =2;
		double result = num1/num2; //1.0
		
		//Constant
		final double PI =3.14;
		//PI=8;//Avoid to change the value of PI
		
		//2. Selection
		//   if ... else if ...else if...... else
		//  a. one way if
		//     show whether given var. is +
		if(num1>0) {
			System.out.println("Positive");
		}
		
		// b. Multiple way if elseif else
		//    show whether given var. is +
		//     ..                        -
		//     ..                        0
		if(num1>0) {
			//print +
		}
		else if(num1<0) {
			//print -
		}
		// many else if as you want 
		else {
			//print 0
		}
		
		
		//Not good design--> introduce redundancy checking
		if(num1>0) {//T/F
			
		}
		
		if(num1<0) {
			
		}
		
		if(num1==0) {
			
		}
		
		// Switch()
		//
		
		//Parameters for switch, they are 
		//  always variable: int, char, byte
		//Show the corresponding month name based 
		//  on the number given by user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int monthNum =input.nextInt(); //2
		
		switch(monthNum){
		case 1: System.out.println("Jan");break;
		case 2: System.out.println("Feb");break;
//		case 3:
		default:System.out.println("Not a month");break;
		}
		
		
		//Loop
		//For: when we know the number of loops needed
		
		int[] nums = {1,2,3,5,6};
//		nums[0]
//		nums[1]
//		nums[2]
//      ..
//      nums[n]
		
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		
		//While: We don't know how many time will our loop run
		// 5 --->  1 2 6 5,   1 1 1 ....5
		int i=0;
		while(i<nums.length) {//4<5
			System.out.println(nums[i]);
			i++;
		}
		
		//i? -->0? 5
		
		//Do-while: Run before check the cond
		//           --> at least run once
		i=0;
		
		do {
			System.out.println(nums[i]);
			i++;
		}while(i<nums.length);
		
		
		
		
		
		//Use the findMin method
		
		//Define an array
		// 1. Declare + init. seperately/together
		
		double[] nums1= new double[100];
		double[] nums2; 
		nums2= new double[100];

		
		// 2. Short hand Approach
		int[] nums3 = {1,2,3};
		
		int smlstEle1 = findMin(nums3);
		
		int[] nums4 = {1,2,-9,3,100,222};
		
		int smlstEle2 = findMin(nums4);

		System.out.println(smlstEle1);
		System.out.println(smlstEle2);
		
		//3. Anonomous array
		int smlstEle3=findMin(new int[] {});
		System.out.println(smlstEle3);

	}
	
	//Methods:
	
	//Given following header and implement 
	// a method that will find the smallest number
	// int the given array.
	
	//Signature: findMin: int[] --> int 
	//Purpose: Find the smallest elements in the
	//          given int array, and return that int value.
	//Examples£º  findMin({1,2,3}) -> 1
	//            findMin({-9,122,211,-33,55,0}) -> -33
	//             findMin({}) -> ??? -1
	public static int findMin(int[] arr) {
		//Main Idea:
		//  1. Assume the 1st element of our array
		//     is the smallest # and save to a variable
		//     named smallestElement
	    //  2. We will use smallestElement to 
		//      compare with all/rest elements in the array 
		//       one-by-one. Once we find any element
		//       is smaller than the smallestElement,
		//        update smallestElement variable using that value.
		
		if(arr.length==0) {
			return -1;
		}
		
		
		int smallestElement =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallestElement) {
				smallestElement=arr[i];
			}
		}
		//Sure: smallestElement will be smallest #
		
		return smallestElement;
		
	}
	
	

}
