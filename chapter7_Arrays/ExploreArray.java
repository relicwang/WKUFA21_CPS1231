package cp7_Arrays;

import java.util.Scanner;

public class ExploreArray {

	public static void main(String[] args) {
		//Save 10 values from user
		
		int num1 = 19;
		int num2 = 29;
		int num3 = 23;
		int num4 = 52;
		//..
		int num10 =767;
		
		
		//using array approach
		//declaration + initialization to create
		// a variable
		
//		
//		double i;
//		i = 100;
//		
		double j = 100;
		
		
		//Create a array that could 10 int nums
		
		//1. Declaration + initilization seperately
		int[] numArray;
		numArray = new int[10];
		
		
		//Array to save 40 students String names
		String[] names = new String[40];
		
		//Array to save 270 students' final exam grade
		double[] scores = new double[270];
		
		//Save the score one-by-one in the console
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the score one-by-one:");
		
//		//Save the 1st score to the scores array
//		scores[0]=input.nextDouble();
//		
//		//Save the 2nd score to the scores array
//		scores[1]=input.nextDouble();
//		
//		//Save the 3rd score to the scores array
//		scores[2]=input.nextDouble();
//		
//		//...
//		
//		
//		//Save the 50th score to the scores array
//		scores[49]=input.nextDouble();
		
		for(int i =0;i<scores.length;i++) {
			scores[i]=input.nextDouble();
		}
		
		
		//2. Declaration + initilization together
		int[] numArray1 = new int[10];

		//3. Assign the element in the array
		numArray1[0]=15;
		
		numArray1[7]=-19;
		
		//4. Access the element in the array 
		//   Compute the sum of all element in the array
		
//		int sum =numArray1[0]+numArray1[1]+numArray1[2]+
//		numArray1[3]+ //... + numArray1[9];
		
		
		int sum = 0;
		for(int i=0;i<numArray.length;i++) {
			sum=sum+numArray[i];
		}
		
		
		
		
	}

}
