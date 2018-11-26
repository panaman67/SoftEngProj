import java.util.*;

public class Cart
{
	public static ArrayList<String> items;
	public static float total;

	public Cart()
	{
		items = new ArrayList<String>();
	}

	public String toString()
	{
		String buff = "------Current Cart------\n";

		for (String item : items)
		{
			buff += item;
		}
		return buff;
	}
}
