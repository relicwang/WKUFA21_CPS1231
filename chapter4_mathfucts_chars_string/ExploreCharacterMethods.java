package cp4_Character;

import java.util.Scanner;

//Purpose: Explore different Character methods
public class ExploreCharacterMethods {

	public static void main(String[] args) {
		//1. Get a character from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a character:");
		String text = input.next();
		char ch = text.charAt(0);
		
	
		//2. Check whether the character is digit
		//Regular Approch
//		if('0'<=ch&&ch<='9') {
//			//Show is digit
//		}
//		else {
//			//Show is not digit
//		}
		
		// Character method approach
		if(Character.isDigit(ch)) {
			//Show is digit
			System.out.println(ch +" is digit");
		}
		else {
			//Show is not digit
			System.out.println(ch +" is NOT digit");

		}
		
		
	}

}
