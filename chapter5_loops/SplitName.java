package cp4_Strings;

import java.util.Scanner;

//Purpose: Retrieve the first name and last name from
//          the full name given by user.
//         Print out the last name and first name in order
public class SplitName {

	public static void main(String[] args) {
		//1. Get the full name from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the full name:");
		String name = input.nextLine();
		
		
		
//		System.out.println("Name is : "+ name);
		
		//2. Get the index of the space
		int indexOfSpace =  name.indexOf(' ');
//		System.out.println(indexOfSpace);

		
		//3. Get the first name 
		String firstName = name.substring(0,indexOfSpace);

		//4. Get the last name
		String lastName = name.substring(indexOfSpace+1);

		//5. Print the last name and first
		
		System.out.println("The last name is "+lastName);
		System.out.println("The first name is "+firstName);

		
	}

}
