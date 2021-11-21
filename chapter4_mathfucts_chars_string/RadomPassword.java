package cp4_Character;

//Purpose:  Generate a random password with length 5,where
//             the 1st and 4th are random uppercase letters,
//             the 2nd          is random lower case letter,
//             the 3rd and 5th are random digits ([0,9])
public class RadomPassword {

	public static void main(String[] args) {
		//1. Generate 2  random uppercase letters
		char upperLetter1 = (char)('A'+(int)(Math.random()*26));
		char upperLetter2 = (char)('A'+(int)(Math.random()*26));

		//2. Generate random lower case letter
		char lowerLetter1 = (char)('a'+(int)(Math.random()*26));

		//3. Generate 2  random digits
		char digit1 = (char)('0'+(int)(Math.random()*10));
		char digit2 = (char)('0'+(int)(Math.random()*10));

		
		
		//4. Combine these 5 characters together to compose 
		//   the password
		String password = 
				""+upperLetter1+lowerLetter1+digit1+upperLetter2+digit2;
		
		//5. Print the random password
		System.out.println(password);
				
	}

}
