package cp5_Loops;

import java.util.Scanner;

//Purpose: Generate a number guessing game, where
//			a random integer in [0,100] will be generated.
//			User will try a guess, the program
//			should show the corresponding output
//			(too low, too high, correct guess).
public class GuessNumberUsingDoWhile {

	public static void main(String[] args) {
		//1. Generate a random int in [0,100]
		int key = (int)(Math.random()*101);
		System.out.println(key);
		
		
		//2. Declare the userguess
		int userGuess;
		
		//2. Using do-while loop continuely 
		//    accept the user input untill
		//    mactch the key
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Please eneter a magic number between [0,100]:");
		    userGuess = input.nextInt();
			
		    if(userGuess<key) {
				System.out.println("Too Low");
			}
			else if(userGuess>key) {
				System.out.println("Too High");
			}
			else {
				System.out.println("Correct Guess");
			}
		 
		}while(userGuess!=key);
		

		
	}

}
