import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		int total;
		
		System.out.println("Would you like to execute addition or subtraction?\nA/S");
		String operationLetter = scanner.nextLine();
		System.out.println(operationLetter);
		
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
		} 
		/*
		else {
			System.out.println("Please enter a valid letter to indicate the operation.");
		}
		*/
		scanner.close();	
	}
}