package week3_Java101;
import java.util.Scanner;

//Purpose: Compute the area of the circle with
//           radius given by user.
//Core idea：  area = pi*r*r
public class CircleAreaRadiusFromUser {

	public static void main(String[] args) {
		//1. Get the radius from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a radius:");
		double radius = input.nextInt();
		
//		System.out.println(radius);
		
		//2. Define the PI
		double pi = 3.14159;
		
		//3. Compute area: area = pi*r*r
		double area = pi*radius*radius;
		
		//4. Show the area
		System.out.println("The area of a circle with radius "
				+ radius+ " is "+ area);
		
	}

}
