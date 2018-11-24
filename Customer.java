import java.util.*;

public class Customer
{
	public float total = 0f;

	static void checkout()
	{
		// after every item scanned
		// prompt for next item, cancel, or pay
		Scanner stdin = new Scanner(System.in);
		InvGlobl inv = InvGlobl.getInstance();
		Cart cart = new Cart();

		//float total = 0f;
		int choice = -1;

		System.out.println(inv);

		char action;

		do
		{
			System.out.print("(S)can/(P)ay/(C)ancel: ");
			action = stdin.nextLine().charAt(0);
			action = Character.toLowerCase(action);

			switch (action)
			{
				case 's':
					//scanItem(cart);    MAKE CART GLOBAL SINGLETON
					break;
				case 'p':
					//pay for cart
					break;
				case 'c':
					//cancel payment
					return;
				default:
					System.out.println("Not a valid option");
					break;
			}
		} while (true);
	}

	float scanItem(Cart cart)
	{
		Scanner stdin = new Scanner(System.in);
		InvGlobl inv = InvGlobl.getInstance();
		int choice;

		do
		{
			System.out.print("What item to scan (0 to exit): ");
			choice = Helpers.extractInt(stdin.nextLine(), inv.names.size());

			// REFACTOR INTO TRY/CATCH
			switch (choice)
			{
				case 1:
					//cart.items.add(inv.get(choice - 1));
					//total += inv.get(choice - 1).price;
					break;
				case 2:
					//cart.items.add(inv.get(choice - 1));
					//total += inv.get(choice - 1).price;
					break;
				case 3:
					//cart.items.add(inv.get(choice - 1));
					//total += inv.get(choice - 1).price;
					break;
				case 4:
					//cart.items.add(inv.get(choice - 1));
					//total += inv.get(choice - 1).price;
					break;
			}

			System.out.println(cart);
			System.out.println(String.format("Total: %.2f", total));
		} while (choice > 0);
		return total;
	}
}
