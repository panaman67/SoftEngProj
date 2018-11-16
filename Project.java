import java.util.*;

public class Project
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Inventory inv = new Inventory();
		Item fruit = new Item("Apple", 2.98);

		int choice = -1;

		inv.put(fruit, 3);
		
		displayMenu();
		System.out.println(inv);
	}

	static void displayMenu()
	{
		System.out.println("1: Start Checkout");
	}
}