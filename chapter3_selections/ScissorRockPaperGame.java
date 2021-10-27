package selections;
import java.util.*;

//Purpose: 
//         Implement a simple version of scissor(0), rock(1)
//           and paper(2) game, where the PC action will be
//           generated randomly (0/1/2).
//         Result will be shown after user enter the action.
public class ScissorRockPaperGame {

	public static void main(String[] args) {
		//1. Generate a random computer action
		int computerAction = (int)(Math.random()*3);
		
		//2. Get the user action via number
		Scanner input = new Scanner(System.in);
		System.out.println("Scissor(0), rock(1), paper(2):");
		int userAction = input.nextInt();
		
		//3. Check and show the result
		// 1. computerAction = 0:
		//     a. userAction = 0: "Computer is scissor." 
		//                         "And user is scissor."
		//                         "Result is draw" 
		//     b. userAction = 1: "Computer is scissor." 
		//                         "And user is Rock."
		//                         "Result is: You win" 
		//     c. userAction = 2: "Computer is scissor." 
		//                         "And user is Paper."
		//                         "Result is: Computer wins"
		// 2. computerAction = 1:
		//     a. userAction = 0: "Computer is Rock." 
		//                         "And user is Scissor."
		//                         "Result is Computer Wins" 
		//     b. userAction = 1: "Computer is Rock." 
		//                         "And user is Rock."
		//                         "Result is: Draw" 
		//     c. userAction = 2: "Computer is Rock." 
		//                         "And user is Paper."
		//                         "Result is: You Win"
		// 3. computerAction = 2:
		//     a. userAction = 0: "Computer is Paper." 
		//                         "And user is Scissor."
		//                         "Result is You Win" 
		//     b. userAction = 1: "Computer is Paper." 
		//                         "And user is Rock."
		//                         "Result is: Computer Wins" 
		//     c. userAction = 2: "Computer is Paper." 
		//                         "And user is Paper."
		//                         "Result is: Draw"
		/*
		 * switch(computerAction) { case 0: switch(userAction) { case 0:
		 * System.out.println("Computer is Scissor." );
		 * System.out.println("And user is Scissor.");
		 * System.out.println("Result is: Draw"); break; case 1:
		 * System.out.println("Computer is Scissor." );
		 * System.out.println("And user is Rock.");
		 * System.out.println("Result is You Win"); break; case 2:
		 * System.out.println("Computer is Scissor." );
		 * System.out.println("And user is Paper.");
		 * System.out.println("Result is Computer Wins"); break; }
		 * 
		 * break; case 1: switch(userAction) { case 0:
		 * System.out.println("Computer is Rock." );
		 * System.out.println("And user is Scissor.");
		 * System.out.println("Result is: Computer Wins."); break; case 1:
		 * System.out.println("Computer is Rock." );
		 * System.out.println("And user is Rock.");
		 * System.out.println("Result is Draw"); break; case 2:
		 * System.out.println("Computer is Rock." );
		 * System.out.println("And user is Paper.");
		 * System.out.println("Result is You Win"); break; } break; case 2:
		 * switch(userAction) { case 0: System.out.println("Computer is Paper." );
		 * System.out.println("And user is Scissor.");
		 * System.out.println("Result is: You Win ."); break; case 1:
		 * System.out.println("Computer is Paper." );
		 * System.out.println("And user is Rock.");
		 * System.out.println("Result is Computer Wins"); break; case 2:
		 * System.out.println("Computer is Paper." );
		 * System.out.println("And user is Paper.");
		 * System.out.println("Result is Draw"); break; } break; }
		 */
		
		
		switch(computerAction-userAction) {
			case 1: 
				System.out.println("Computer Wins"); break;
			case -2: System.out.println("Computer Wins");break;
			case 0:  System.out.println("Draw");break;
			default:  System.out.println("User Wins");break;
		}
	}

}
