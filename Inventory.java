import java.util.HashMap;

public class Inventory extends HashMap<Item, Integer>
{
	public String toString()
	{
		String buff = "";
		buff += "      Current Inventory       \n";
		buff += "------------------------------\n";

		for (Entry<Item, Integer> item : this.entrySet())
		{
			buff += item.getKey().name + " " + item.getValue() + "\n";
		}
		return buff;
	}
}