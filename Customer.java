import java.util.*;

public class Customer
{
	static void checkout()
	{
		Scanner stdin = new Scanner(System.in);
		Inventory inv = Inventory.getInstance();
		Cart cart = new Cart();
		float total = 0f;
		char action;
		
		System.out.println(inv);
		while (true)
		{
			System.out.print("(S)can/(P)ay/(C)ancel: ");
			action = stdin.nextLine().charAt(0);
			action = Character.toUpperCase(action);

			switch (action)
			{
				case 'S':
					total += scanItem();
					System.out.println(Cart.items);
					System.out.println(String.format("Total: %.2f", total));
					break;
				case 'P':
					payBill(total);
					return;
				case 'C':
					System.out.println("Transaction Canceled");
					return;
				default:
					System.out.println("Not a valid option");
			}
		}
	}

	static float scanItem()
	{
		Scanner stdin = new Scanner(System.in);
		Inventory inv = Inventory.getInstance();
		int choice;

		while (true)
		{
			try
			{
				System.out.print("What item to scan: ");
				choice = Helpers.extractInt(stdin.nextLine(), inv.names.size());
				if (inv.getItemAmount(choice - 1) > 0)
				{
					Cart.items.add(inv.getItemName(choice - 1));
					inv.amounts.set(choice - 1, inv.getItemAmount(choice - 1) - 1);
					return inv.getItemPrice(choice - 1);
				}
				System.out.println("Item out of stock!");
				return 0f;
			}
			catch (IndexOutOfBoundsException e)
			{
				continue;
			}
		}
	}

	static void payBill(float total)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println(String.format("Your total bill is: $%.2f", total));
		System.out.print("How would you like to pay (card/cash): ");
		while (true)
		{
			if (stdin.nextLine().toUpperCase().equals("CASH"))
			{
				Payment.payWithCash(total);
				break;
			}
			else if (stdin.nextLine().toUpperCase().equals("CARD"))
			{
				Payment.payWithCard(total);
				break;
			}
		}
	}
}
