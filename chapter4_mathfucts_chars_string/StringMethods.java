package cp4_Strings;

import java.util.Scanner;

//Purpose: Play with String methods
public class StringMethods {

	public static void main(String[] args) {
		//concat method 
		String s1 = "w";
		String s2 = "ku";
		//"wku"
		//Approach 1:
		String s3 = s1+s2;
		
		//Approach 2:
		String s4 = s1.concat(s2);
		
		
		String s5 ="avacaca";
		
		//Prefix: leading characters
		
		//Suffix: tailing characters
		String s6 = "fadfafaf";
		
		//1. Start with || prefix
		// "abacacc"  --> does not start with "wku"
		// "abacaccwku"  --> does not start with "wku"
		// "awkubacaccwku"  --> does not start with "wku"
		// "wkubacaccwku"  -->  start with "wku"

		//3. End with || suffix
		// "abacacc"  --> does not end with "wku"
		// "abacwkuacc"  --> does not end with "wku"
		// "awkubacacc"  --> does not end with "wku"
		// "wkubacacc"  -->  does not end with "wku"
		// "bacaccwku"  -->   end with "wku"
		
		
		if(s6.startsWith("wenz")) {
			System.out.println(s6+" is starts with wenz");
		}
		else {
			System.out.println(s6+" is NOT starts with wenz");		
		}
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println(input);
		
		
		
	}

}
