package selections;
import java.util.*;
//Purpose:  Create subtraction question using
//            2 random single-digit integers(num1, num2).
//            where num1 >= num2. 
//          Check the user answer with the key, 
//          and show the corresponding result.
public class SubtractionPractice {

	public static void main(String[] args) {
		//1. Generate 2 single-digit integer numbers
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);

		//2. Swap num1 and num2 value as necessary:
		//    if(num1<num2)
		if(num1<num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//3. Show the question to user, compute the key
		System.out.println("What's: "+num1+" - "+num2+" = ?");
		int key = num1 - num2;
		
		//4. Get user answer
		Scanner input = new Scanner(System.in);
		int userAnswer = input.nextInt();
		
		
		//5. Compare the user answer with the key 
		//    and show the result
		if(userAnswer == key) {
			System.out.println("Your answer is correct");
		}
		else {
			System.out.println("Your answer is incorrect");
			System.out.println(num1+" - "+num2+" = "+key);
		}
	}

}
