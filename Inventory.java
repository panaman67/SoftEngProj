import java.util.ArrayList;
import java.util.*;
import java.io.*;

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

		String item;

		try{
			File input = new File("inventoryReport.txt");
			Scanner in = new Scanner(input);
			while(in.hasNextLine()){
				item = in.nextLine();
				String[] itemInfo = item.split("/");

				names.add(itemInfo[0]);
				amounts.add(Integer.parseInt(itemInfo[1]));
				prices.add(Float.parseFloat(itemInfo[2]));
			}
			in.close();
		}
		catch (IOException e){
		}
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