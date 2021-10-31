package selections;

import java.util.Scanner;
//Purpose:  Check whether the given number from user is
//           even. 
//          Show even if so; Otherwise, show odd.

public class CheckEvenNumber {

	public static void main(String[] args) {
		//1. Get a number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = input.nextInt();
		
		//2. Check whether the number is even:
		//      if so---> print "even number"
		//      Otherwise ---> print "odd number"
		if(number%2==0) {
			System.out.println(number +" is a Even number");
		}
		else {
			System.out.println(number +" is a Odd number");
		}
		
	}

}
