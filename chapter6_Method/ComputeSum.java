package cp6_Method;

//Purpose: Compute the sum of integers from 1 to 10,
//          20 to 30 and 35 to 45 respectively.
public class ComputeSum {

	public static void main(String[] args) {
		//1. Compute the sum of integers from 1 to 10
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		
		
		//2. Compute the sum of integers from 20 to 30
		sum = 0;
		for(int i=10;i<=20;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		//3. Compute the sum of integers from 35 to 45
		sum = 0;
		for(int i=35;i<=45;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
