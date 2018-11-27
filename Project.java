import java.util.*;

public class Project
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		Inventory inv = Inventory.getInstance();

		while(true) {
			int selected = -1;
			displayMenu();
			System.out.print("Choice: ");

			selected = Helpers.extractUnsignedInt(stdin.nextLine(), 2);
			switch (selected) {
				case 0:
					Customer.checkout();
					break;
				case 1:
					Restock.restock();
					break;
				case 2:
					return;
			}
		}
	}

	static void displayMenu()
	{
		System.out.println("0: Start Checkout");
		System.out.println("1: Restock Inventory");
	}
}
