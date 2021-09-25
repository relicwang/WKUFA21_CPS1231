package week3_Java101;

import java.util.Scanner;

//Purpose: Compute the perimeter of circle with
//          radius from user
//Main Idea:  Perimeter = 2*PI*r
public class CirclePerimeter {

	public static void main(String[] args) {
		//1. Get the radius from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a radius:");
		double radius = input.nextDouble();
		
		//2. Define PI
		final double PI = 3.14159;
	
		//3. Compute the perimeter
		double perimeter = 2*PI*radius;
		
		//4. Show the perimeter
		System.out.println("The preimetet of the circle "
				+ " with radius : " + radius + " is "+ perimeter);
		
	}

}
