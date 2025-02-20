import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float firstNumber;
		float secondNumber;
		float sum;
		float difference;
		float product;
		float quotient;
		String operationLetter;

			
		System.out.println("Would you like to execute addition, subtraction, "
				+ "multiplication, or division?\n"
				+ "Please indicate by typing any operation's corresponding character.\nA/S/M/D\n");
		
		
		operationLetter = scanner.nextLine().toUpperCase();
	
		
		try {
			switch(operationLetter) {
				
			case "A":
					
					System.out.println("You have chosen: Addition");
					System.out.println("Please enter two whole numbers for addition.");
					
					firstNumber = scanner.nextFloat();
					secondNumber = scanner.nextFloat();
					sum = firstNumber + secondNumber;
					
					System.out.println(String.format("%f + %f = %f", firstNumber, secondNumber, sum));
					
					break;
	
				case "S":
						
					System.out.println("You have chosen: Subtraction");
					System.out.println("Please enter two whole numbers for subtraction.\n"
							+ "Note that the first number will be the minuend and the second will thus be "
							+ "the subtrahend.");
					
					firstNumber = scanner.nextFloat();
					secondNumber = scanner.nextFloat();
					difference = firstNumber - secondNumber;
					
					System.out.println(String.format("%f - %f = %f", firstNumber, secondNumber, difference));
					break;
					
				case "M":
					
					System.out.println("You have chosen: Multiplication");
					System.out.println("Please enter two whole numbers for multiplication.\n");
					firstNumber = scanner.nextFloat();
					secondNumber = scanner.nextFloat();
					product = firstNumber * secondNumber;
					System.out.println(String.format("%f * %f = %f", firstNumber, secondNumber, product));
					break;
					
				case "D":
					
					System.out.println("You have chosen: Division");
					System.out.println("Please enter two whole numbers for division.\n"
							+ "Note that the first number will be the dividend and the second"
							+ "number will be the divisor.\n");
					firstNumber = scanner.nextFloat();
					secondNumber = scanner.nextFloat();
					if (secondNumber == 0) {
						System.out.println("Error: Divide by Zero");
						System.exit(0);
					}
					quotient = firstNumber / secondNumber;
					System.out.println(String.format("%f / %f = %f", firstNumber, secondNumber, quotient));
					break;
				
				default: 
					System.out.println("That is not a valid operator.");
			}
		} 
		
		catch (InputMismatchException e){
			System.err.println("This is not a valid input.");
			e.printStackTrace();
		}
				
		scanner.close();
		
		
		// git checkout -b [name of branch]
		// ^ this is to create a new branch
		// git checkout [master] or git checkout[branch-name] changes your location to branch or master
		// old version:
		
		/*
		if (operationLetter.equals("A")) {
			System.out.println("Please enter two whole numbers for addition.");
			
			firstNumber = scanner.nextInt();
			secondNumber = scanner.nextInt();
			total = firstNumber + secondNumber;
			
			System.out.println(String.format("%d + %d = %d", firstNumber, secondNumber, total));

		} else if (operationLetter.equals("S")) {
			System.out.println("Please enter two whole numbers for subtraction.\n"
					+ "Note that the first number will be the minuend and the second will thus be "
					+ "the subtrahend.");
			
			firstNumber = scanner.nextInt();
			secondNumber = scanner.nextInt();
			total = firstNumber - secondNumber;
			
			System.out.println(String.format("%d - %d = %d", firstNumber, secondNumber, total));
		} else {
			System.out.println("Please enter a valid letter to indicate the operation.");
		*/
		
	}
}