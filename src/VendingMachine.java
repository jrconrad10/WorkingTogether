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
		
		input.nextLine();
		
		System.out.println("Are you sure you want to make this purchase? Y for yes, N for no.");
		
		String confirmation = input.nextLine();
		
		if(confirmation.contains("Y"))
		{
			if (purchase.contains("C")) {
				if ((double)moneyInput == chips) {
					System.out.println("Here are your chips. Have a good day.");
				}
				else if((double)moneyInput > chips) {
					System.out.println("Here are your chips and " + (moneyInput - chips) + " dollars. Have a good day.");
				}
				else {
					System.out.println("You did not insert the required amount of money.");
				}
			}
			else if (purchase.contains("CB")) {
				if ((double)moneyInput == candyBar) {
					System.out.println("Here is your candy bar. Have a good day.");
				}
				else if((double)moneyInput > candyBar) {
					System.out.println("Here is your candy bar and " + (moneyInput - candyBar) + " dollars. Have a good day.");
				}
				else {
					System.out.println("You did not insert the required amount of money.");
				}
			}
			else if (purchase.contains("G")) {
				if ((double)moneyInput == gum) {
					System.out.println("Here is your gum. Have a good day.");
				}
				else if((double)moneyInput > gum) {
					System.out.println("Here is your gum and " + (moneyInput - gum) + " dollars. Have a good day.");
				}
				else {
					System.out.println("You did not insert the required amount of money.");
				}
			}
			else if (purchase.contains("P")) {
				if ((double)moneyInput == pretzels) {
					System.out.println("Here are your pretzels. Have a good day.");
				}
				else if((double)moneyInput > pretzels) {
					System.out.println("Here are tour pretzels and " + (moneyInput - pretzels) + " dollars. Have a good day.");
				}
				else {
					System.out.println("You did not insert the required amount of money.");
				}
			}
			else if (purchase.contains("POP")) {
				if ((double)moneyInput == popcorn) {
					System.out.println("Here is your popcorn. Have a good day.");
				}
				else if((double)moneyInput > popcorn) {
					System.out.println("Here is your popcorn and " + (moneyInput - popcorn) + " dollars. Have a good day.");
				}
				else {
					System.out.println("You did not insert the required amount of money.");
				}
			}
			else {
				System.out.println("You did not input a valid item.");
			}
		}
		else {
			System.out.println("Your purchase has been cancelled and refunded. Here is your " + moneyInput + " dollars. Have a great day.");
		}
	}
}