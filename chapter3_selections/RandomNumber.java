package selections;

//Purpose: Generate a random double value in
//           [0,10) and show the value.
public class RandomNumber {

	public static void main(String[] args) {
		//1. Generate a random double value
		//    in [0,10)
		double num = Math.random()*10; // [0,1)*10 ---> [0,10)
		
		//2. Print the value
		System.out.println("The random number is: "+num);
	}

}
