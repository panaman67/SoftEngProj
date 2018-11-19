import java.util.HashMap;

public class Inventory extends HashMap<Item, Integer>
{
	public Inventory()
	{
		this.put(new Item("Apple", 2.98f), 10);
		this.put(new Item("Vodka", 10.00f), 10);
		this.put(new Item("Pie", 13.23f), 10);
		this.put(new Item("Bread", 5.00f), 10);
	}

	public String toString()
	{
		String buff = "";
		buff += "     Current Inventory     \n";
		buff += "---------------------------\n";

		for (Entry<Item, Integer> item : this.entrySet())
		{
			buff += String.format("%-10s  %15d%n", item.getKey().name, item.getValue());
		}
		return buff;
	}
}