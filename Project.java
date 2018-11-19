import java.util.*;

public class Project
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int selected = -1;

		Inventory inv = new Inventory();
		Item apple = new Item("Apple", 2.98);
		Item alcohol = new Item("Vodka", 10.00);
		Item pie = new Item("Pie", 13.23);
		Item bread = new Item("Bread", 5.00);

		inv.put(apple, 10);
		inv.put(alcohol, 10);
		inv.put(pie, 10);
		inv.put(bread, 10);
		
		displayMenu();
		System.out.print("Choice: ");
		

		selected = Helpers.extractUnsignedInt(stdin.nextLine(), 4);
		switch (selected)
		{
			case  0:
				System.out.println(inv);
				break;
			case 1:
				customerCheckout();
				break;
			case 2:
				System.out.print("Enter item ID: ");
				break;
			case 3:
				break inputloop;
		}

		System.out.println("\nThank you! Please come again!");
	}

	static void displayMenu()
	{
		System.out.println("1: Start Checkout");
		System.out.println("2: Manager Options");
	}

	static void customerCheckout(Inventory inv)
	{
		ArrayList cart = new ArrayList<Item>();
		System.out.println(inv);

	}
}