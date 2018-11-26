import java.util.*;

public class Customer
{
	public static float total = 0f;  // FIXME: make non-static

	static void checkout()
	{
		// after every item scanned
		// prompt for next item, cancel, or pay
		Scanner stdin = new Scanner(System.in);
		Inventory inv = Inventory.getInstance();
		Cart cart = new Cart();

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
					total += scanItem();  // FIXME: remove cart param
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

		System.out.print("What item to scan: ");
		choice = Helpers.extractInt(stdin.nextLine(), inv.names.size());

		try
		{
			Cart.items.add(inv.getItemName(choice - 1));
			total += inv.getItemPrice(choice - 1);
		}
		catch (Exception e)
		{
			//return -1f;
		}

		System.out.println(Cart.items);
		System.out.println(String.format("Total: %.2f", total));

		return total;
	}
}
