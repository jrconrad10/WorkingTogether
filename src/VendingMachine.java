import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args)
	{
		double chips = 2.00;
		double candyBar = 1.00;
		double gum = 0.50;
		double pretzels = 1.00;
		double popcorn = 3.00;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to our vending machine.");
		System.out.println("Enter C for chips. Enter CB for a candy bar. Enter G for gum. Enter P for pretzels. Enter POP for popcorn.");
		
		String purchase = input.nextLine();
		
		System.out.println("Please insert money by typing in a number with two decimals.");
		
		Double moneyInput = input.nextDouble();
	}
}