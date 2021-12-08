package cp5_Loops;

//Purpose: Print the traffic light:
//         Print "red light" 5 times;
//         Print "green light" 3 times;
//         Print "Yellow light" 1 times;
public class TrafficLightForLoop {

	public static void main(String[] args) {
		// 1. For loop for red light
	
		for(int redLightCount = 0;redLightCount<5;redLightCount++) {
			System.out.println("Red Light");
		}

		// 2. For loop for green light
		for(int greenLightCount=0;greenLightCount<3;greenLightCount++) {
			System.out.println("Green Light");
		}
		
		// 3. While loop for yellow light
		for(int yellowLightCount = 0;yellowLightCount<1;yellowLightCount++) {
			System.out.println("Yellow Light");
		}
	
	}

}
