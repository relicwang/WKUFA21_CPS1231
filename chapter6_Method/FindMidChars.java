package cp6_Method;

public class FindMidChars {

	public static void main(String[] args) {
		//Test Cases
		
		//1. String with even length
		System.out.println(midChars("abcd").equals("bc"));
		System.out.println(midChars("1234").equals("23"));

		//2. String with odd length
		System.out.println(midChars("abc").equals("b"));
		System.out.println(midChars("123").equals("2"));

		
		//3. String is empty
	}
	
	//Signature: midChars: String --> String
	//Purpose: Find the middle character(s) from 
	//        and the given string return them.
	//         If the string length is even,
	//          return the middle 2 chars
	//         If the string length is odd,
	//          return the middle 1 char.
	//Examples:
	//         midChars("abc") --> "b"
	//         midChars("abcd") --> "bc"
	//         midChars("1242") --> "24"
	public static String midChars(String orgString) {
		int stringLen =orgString.length();
		
		//1. String with odd length
		
		if(stringLen%2!=0) {
			char midChar = orgString.charAt(stringLen/2);
			return Character.toString(midChar);
		}
		
		//2. String with even length
		else {
			
			return orgString.substring(stringLen/2-1,stringLen/2+1 );
			
		}
		
	}
	
	

}
