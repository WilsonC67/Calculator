import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		int product;
		int quotient;
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
					
					firstNumber = scanner.nextInt();
					secondNumber = scanner.nextInt();
					sum = firstNumber + secondNumber;
					
					System.out.println(String.format("%d + %d = %d", firstNumber, secondNumber, sum));
					
					break;
	
				case "S":
						
					System.out.println("You have chosen: Subtraction");
					System.out.println("Please enter two whole numbers for subtraction.\n"
							+ "Note that the first number will be the minuend and the second will thus be "
							+ "the subtrahend.");
					
					firstNumber = scanner.nextInt();
					secondNumber = scanner.nextInt();
					difference = firstNumber - secondNumber;
					
					System.out.println(String.format("%d - %d = %d", firstNumber, secondNumber, difference));
					break;
					
				case "M":
					
					System.out.println("You have chosen: Multiplication");
					System.out.println("Please enter two whole numbers for multiplication.\n");
					firstNumber = scanner.nextInt();
					secondNumber = scanner.nextInt();
					product = firstNumber * secondNumber;
					System.out.println(String.format("%d * %d = %d", firstNumber, secondNumber, product));
					break;
					
				case "D":
					
					System.out.println("You have chosen: Division");
					System.out.println("Please enter two whole numbers for division.\n"
							+ "Note that the first number will be the dividend and the second"
							+ "number will be the divisor.\n"
							+ "Also, all quotients will be rounded to be integers.");
					firstNumber = scanner.nextInt();
					secondNumber = scanner.nextInt();
					quotient = firstNumber / secondNumber;
					System.out.println(String.format("%d / %d = %d", firstNumber, secondNumber, quotient));
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