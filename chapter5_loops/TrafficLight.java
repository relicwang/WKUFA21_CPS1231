package cp5_Loops;

//Purpose: Print the traffic light:
//           Print "red light" 5 times;
//           Print "green light" 3 times;
//           Print "Yellow light" 1 times;
public class TrafficLight {

	public static void main(String[] args) {
		
		//Repeat 10 times
		
		for(int i =0;i<10;i++) {
			//1. While loop for red light
			int redLightCount = 0;
			while(redLightCount<5) {
				System.out.println("Red Light");
				redLightCount++;
			}
			
			//2. While loop for green light
			int greenLightCount = 0;
			while(greenLightCount<3) {
				System.out.println("Green Light");
				greenLightCount++;
			}
			
			//3. While loop for yellow light
			int yellowLightCount = 0;
			while(yellowLightCount<1) {
				System.out.println("Yellow Light");
				yellowLightCount++;
			}
		}
		
		
		
		
	}

}
