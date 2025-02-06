import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Addition: Please enter two whole numbers.");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		
		int total = firstNumber + secondNumber;
		System.out.println(String.format("%d + %d = %d", firstNumber, secondNumber, total));
		
		scanner.close();
	}
}
