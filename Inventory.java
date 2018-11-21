import java.util.*;

public class Inventory extends ArrayList<Item>
{
	public Inventory()
	{
		this.add(new Item("apple",  3.25f));
		this.add(new Item("vodka", 10.13f));
		this.add(new Item("pie"  , 13.23f));
		this.add(new Item("bread",  5.99f));
	}

	public String toString()
	{
		String buff = "------Inventory-----\n";

		for (Item item : this)
			buff += item;
		return buff;
	}
}
