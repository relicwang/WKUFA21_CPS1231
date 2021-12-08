package cp5_Loops;

//Purpose: Generate multiplication table
public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		for(int rowIndex=1;rowIndex<10;rowIndex++) {
			//Skip Row 5
//			if(rowIndex==5) {
//				continue;
//			}
			
			if(rowIndex==6) {
				break;
			}
			
			//Print corresponding row based on
			//  given rowIndex
			for(int colIndex=1;colIndex<10;colIndex++) {
				//2.
				System.out.printf("%3d",rowIndex*colIndex);
				//3.
			}
			//4.
			System.out.println();
		}
		
		//1. Print 1st row
		

		
		//2. Print 2nd row
//		for(int colIndex=1;colIndex<10;colIndex++) {
//			System.out.print(2*colIndex+" ");
//		}
//		
//		
//		//3. Print 3rd row
//		for(int colIndex=1;colIndex<10;colIndex++) {
//			System.out.print(3*colIndex+" ");
//		}
//		
		//....
		
		
	}

}
