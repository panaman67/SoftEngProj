import java.util.HashMap;

public class Inventory extends HashMap<Item, Integer>
{
	public String toString()
	{
		String buff = "";
		System.out.println("      Current Inventory       ");
		System.out.println("------------------------------");

		for (Entry<Item, Integer> item : this.entrySet())
		{
			buff += item.getKey().name + " " + item.getValue();
		}
		return buff;
	}
}