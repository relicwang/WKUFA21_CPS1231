package cp7_Arrays;

import java.util.Arrays;

//Purpose:  Compute the average of 100 random numbers
//           where the range is [0,100)

public class Average100RandomNumbers {

	public static void main(String[] args) {
		//1. Generate 100 random numbers
		//  where the range is [0,100)
		//  and to a double array 
		
		double[] nums = new double[100];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=Math.random()*100;
		}
		
		//2. Compute the sum of all numbers
		
		double sum =0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		
		//3. Compute the average and print out
		double average = sum/nums.length;
		System.out.println("The average is :"+ average);
		System.out.println(Arrays.toString(nums));

		
		
		//4. Find the largest element in the array
		//     +  find the correspodning idex?
		
		// a. Assume the 1st element is the largest
		double largestNum = nums[0];
		int largestNumIndex = 0;
		
		// b. Compare the largestNum variable
		//       with all elements in the array
		//     b-1. We are happy if the largestNum
		//      is greater than all elements in the array
		//     b-2. If any element in the array 
		//          is greater than the largestNum 
		//          update the value largestNum with that
		//           value
		for(int i=0; i<nums.length;i++) {
			if(largestNum<nums[i]) {
				largestNum=nums[i];
				largestNumIndex=i;
			}
		}
		
		System.out.println("The largest # is "+largestNum);
		System.out.println("And the index is "+largestNumIndex);

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
	}

}
