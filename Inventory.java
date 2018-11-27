import java.util.ArrayList;

public class Inventory
{
	private static Inventory INSTANCE;

	public ArrayList<String>  names;
	public ArrayList<Float>   prices;
	public ArrayList<Integer> amounts;

	private Inventory()
	{
		names = new ArrayList<String>();
		prices = new ArrayList<Float>();
		amounts = new ArrayList<Integer>();

		names.add("Apple");
		names.add("Juice");
		names.add("Pie");
		names.add("Bread");

		prices.add(2.34f);
		prices.add(5.43f);
		prices.add(11.32f);
		prices.add(4.13f);

		amounts.add(10);
		amounts.add(10);
		amounts.add(10);
		amounts.add(10);
	}

	public static Inventory getInstance()
	{
		if (INSTANCE == null)
			INSTANCE = new Inventory();
		return INSTANCE;
	}

	public String getItemName(int index)
	{
		return names.get(index);
	}

	public float getItemPrice(int index)
	{
		return prices.get(index);
	}

	public int getItemAmount(int index)
	{
		return amounts.get(index);
	}

	public String toString()
	{
		int num = 1;
		String buff = "-------Inventory-------\n";

		for (int i = 0; i < names.size(); i++)
		{
			buff += String.format("%d: %-10s%10.2f%n", num++, names.get(i), prices.get(i));
		}
		return buff;
	}
}