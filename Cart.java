import java.util.*;

public class Cart
{
	public ArrayList<Item> items;

	public Cart()
	{
		items = new ArrayList<Item>();
	}

	public String toString()
	{
		String buff = "------Current Cart------\n";

		for (Item item : this.items)
		{
			buff += item;
		}
		return buff;
	}
}
