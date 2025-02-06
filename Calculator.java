import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Addition: Please enter two whole numbers.");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		
		int total = firstNumber + secondNumber;
		System.out.println("The sum of the two provided numbers is " + total);
		
		scanner.close();
	}
}
