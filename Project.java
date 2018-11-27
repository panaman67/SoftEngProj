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

			selected = Helpers.extractUnsignedInt(stdin.nextLine(), 3);
			switch (selected) {
				case 0:
					Customer.checkout();
					break;
				case 1:
					Restock.restock();
					break;
				case 2:
					Manager.menu();
					break;
				case 3:
					System.exit(0);
			}
		}
	}

	static void displayMenu()
	{
		System.out.println("0: Start Checkout");
		System.out.println("1: Restock Inventory");
		System.out.println("2: Manager Menu");
		System.out.println("3: Exit");
	}
}
