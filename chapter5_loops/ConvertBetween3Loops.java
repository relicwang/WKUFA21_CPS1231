package cp5_Loops;

//Purpose: Practice with converting between different loops

public class ConvertBetween3Loops {

	public static void main(String[] args) {

		// 1. While loop
		int i = 0;

		while (i < 3) {
			System.out.println("hi");
			i++;
		}

		System.out.println("Bye");

		// 2. Do-while
	    i = 0;

		do{
			System.out.println("hi");
			i++;
		}while (i < 3); 

		System.out.println("Bye");

	}

}
