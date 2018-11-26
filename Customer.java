import java.util.*;

public class Customer
{
	static void checkout()
	{
		Scanner stdin = new Scanner(System.in);
		Inventory inv = Inventory.getInstance();
		Cart cart = new Cart();
		float total;

		System.out.println(inv);
		char action;
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
					//pay(total); ??
					break;
				case 'C':
					//cancel transaction
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
				Cart.items.add(inv.getItemName(choice - 1));
				return inv.getItemPrice(choice - 1);
			}
			catch (IndexOutOfBoundsException e)
			{
				continue;
			}
		}
	}
}
