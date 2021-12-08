package cp5_Loops;

import java.util.Scanner;

//Purpose: Generate a number guessing game, where
//         a random integer in [0,100] will be generated.
//         User will try a guess, the program
//         should show the corresponding output
//         (too low, too high, correct guess).
public class GuessNumber {

	public static void main(String[] args) {
		//1. Generate a random int in [0,100]
		int key = (int)(Math.random()*101);
		System.out.println(key);
		
		
		//2. A int guess from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please eneter a magic number between [0,100]:");
		int userGuess = input.nextInt();
		
		while(userGuess!=key) {//When should we stop loop?   userGuess==key
			//3. Show the corresponding result
			if(userGuess<key) {
				System.out.println("Too Low");
			}
			else {
				System.out.println("Too High");
			}
//			else {//(userGuess!=key)&&(userGuess==key)
//				System.out.println("Correct Guess");
//			}
			
			//4. Accept new user guess
			System.out.println("Please eneter a magic number between [0,100]:");
			userGuess = input.nextInt();
			
		}
		
		
		///..........
		//5. Userguess == key

			System.out.println("Correct Guess");
		
	}

}
