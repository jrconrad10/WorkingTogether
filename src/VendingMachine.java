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
		
		System.out.println("Please input the number of one dollar bills you want to insert.");
		
		int moneyInput = input.nextInt();
		
		System.out.println("Are you sure you want to make this purchase? Y for yes, N for no.");
		String confirmation = input.nextLine();
		
		if(confirmation == "Y")
		{
			if (input == "C") {
				if (moneyInput == chips) {
					
				}
				else if(moneyInput > chips) {
					
				}
				else {
					System.out.println("You did not insert the required amount of money.")
				}
			}
			else if (input == "CB") {
				
			}
			else if (input == "G") {
				
			}
			else if (input == "P") {
				
			}
			else if (input == "POP") {
				
			}
			else {
				
			}
		}
		else {
			System.out.println("Your purchase has been cancelled and refunded. Here is your " + moneyInput + " dollars. Have a great day.");
		}
	}
}