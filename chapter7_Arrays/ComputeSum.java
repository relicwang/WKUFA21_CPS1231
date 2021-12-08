package cp7_Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Purpose: Compute the sum of 20 integer numbers from
//          user
public class ComputeSum {

	public static void main(String[] args) {
		//1. Get 20 numbers from user
		//      and save to int array
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the numbers: ");
		
		int[] nums = new int[5];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=input.nextInt();
		}
		
		
		
		//2. Compute the sum
		
		int sum =0;
		
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
		}
		
		
		
		//3. Show all element in the array and
		//     the sum
		
		//   a. Print element in the array 
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
		//  b. [Convenient Appro.]Print element in the array 
		
		System.out.println("\n"+Arrays.toString(nums));
		
		System.out.println("The sum of 20 elements is "+sum);
		
	}

}
