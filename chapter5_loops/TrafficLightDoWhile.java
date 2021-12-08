package cp5_Loops;

//Purpose: Print the traffic light:
//		   Print "red light" 5 times;
//		   Print "green light" 3 times;
//          Print "Yellow light" 1 times;
public class TrafficLightDoWhile {

	public static void main(String[] args) {
		// 1. While loop for red light
		int redLightCount = 0;
		do{
			System.out.println("Red Light");
			redLightCount++;
		}while (redLightCount < 5);

		
		
		
		// 2. While loop for green light
		int greenLightCount = 0;
		do{
			System.out.println("Green Light");
			greenLightCount++;
		}while (greenLightCount < 3);

		// 3. While loop for yellow light
		int yellowLightCount = 0;
		do{
			System.out.println("Yellow Light");
			yellowLightCount++;
		}while (yellowLightCount < 1);

	}

}
