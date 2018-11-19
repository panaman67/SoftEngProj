import java.util.*;

public class Project
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		Inventory inv = new Inventory();
		int selected = -1;

		displayMenu();
		System.out.print("Choice: ");
		selected = Helpers.extractUnsignedInt(stdin.nextLine(), 2);

		switch (selected)
		{
			case 0:
				CustomerInterface.checkout(inv);
				break;
			case 1:
				ManagerInterface.test();
				break;
			case 2:
				break;
		}

		System.out.println("\nThank you! Please come again!");
	}

	static void displayMenu()
	{
		System.out.println("0: Start Checkout");
		System.out.println("1: Manager Options");
	}
}