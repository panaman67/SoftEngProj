import java.util.*;

public class Cart extends ArrayList<Item>
{
	public String toString()
	{
		String buff = "------Current Cart------\n";

		for (Item item : this)
		{
			buff += item;
		}
		return buff;
	}
}
