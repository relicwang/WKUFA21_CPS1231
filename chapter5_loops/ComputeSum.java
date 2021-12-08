package cp5_Loops;

public class ComputeSum {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 3;
		int num3 = 5;
		
		int sum = num1+num2+num3;
		
		//Regular Approach
		System.out.println("Num1 is "+num1+
				". Num2 is "+ num2+ ". Num3 is "
				+ num3+". The sum is "+sum);
		
		//Formating Output Approach
		System.out.printf("Num1 is %-5d. Num2 is %5d. Num3 is %5d. The sum is %5d",
							num1,num2,num3,sum);
		
	}

}
