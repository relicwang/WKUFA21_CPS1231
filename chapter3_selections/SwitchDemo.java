package selections;
import java.util.*;

//Recap: Switch Construct
//        Show the day of week based on the number from
//         user (in [1,7])
public class SwitchDemo {
	public static void main(String[] args) {
		//1. Get the number from user in [1,7]
		Scanner input = new Scanner(System.in);
		System.out.println("Please entere a number in [1,7]:");
		
		int date = input.nextInt();
		
		//2. Show the day of the week
		
		
		
		      //switch-expression: num1, num2-num1, num1/num2+3-5
		      ///      ----> result should be in 1 of types:
		      //         double?(Not Ok) String?(Not Ok)
		      //        1. int -->Ok
		      //        2. short
	          //        3. byte 
			  //        4. char  e.g. 'a' '1'
		switch(date) {
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursday");
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		case 7: System.out.println("Sunday");break;
		}
		
	}
}
