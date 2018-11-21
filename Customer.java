import java.util.*;

public class Customer
{
	static void checkout(Inventory inv)
	{
		// after every item scanned
		// prompt for next item, cancel, or pay
		Scanner stdin = new Scanner(System.in);
		Cart cart = new Cart();

		float total = 0f;
		int choice = -1;

		System.out.println(inv);

		// FIX THIS FIRST!!!!
		char action;
		System.out.print("(S)can/(P)ay/(C)ancel: ");
		action = stdin.nextLine().charAt(0);

		do
		{
			System.out.print("What item to scan (0 to exit): ");
			choice = Helpers.extractInt(stdin.nextLine(), 4);

			switch (choice)
			{
				case 1:
					cart.add(inv.get(choice - 1));
					total += inv.get(choice - 1).price;
					break;
				case 2:
					cart.add(inv.get(choice - 1));
					total += inv.get(choice - 1).price;
					break;
				case 3:
					cart.add(inv.get(choice - 1));
					total += inv.get(choice - 1).price;
					break;
				case 4:
					cart.add(inv.get(choice - 1));
					total += inv.get(choice - 1).price;
					break;
			}
			System.out.println(cart);
			System.out.println(String.format("Total: %.2f", total));
		} while (choice > 0);
	}
}
