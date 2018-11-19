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

		do
		{
			selected = Helpers.extractUnsignedInt(stdin.nextLine());
		} while (selected != 1);

		

		System.out.println(inv);
	}

	static void displayMenu()
	{
		System.out.println("1: Start Checkout");
	}

	static void 
}