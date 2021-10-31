package selections;

import java.util.Scanner;

//Purpose:  Compare two numbers in integer from user
//            and show the larger one
public class LargerNumber {

	public static void main(String[] args) {
		//1. Get two integer numbers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers:");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//2. Compare two numbers ---> show the larger one
		if(num1>num2) {
			System.out.println("Number 1: "+num1+" is larger.");
		}
		else {//num1<=num2
			System.out.println("Number 2: "+num2+" is larger.");
		}
	
	}

}
