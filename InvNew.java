public class InvNew
{
	public ArrayList<String>  names;
	public ArrayList<Float>   prices;
	public ArrayList<Integer> amounts;

	public InvNew()
	{
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

	public void addItem()
	{
		
	}

	public String toString()
	{
		String buff = "------Inventory-----\n";

		for (int i = 0; i < names.size(); i++)
		{
			buff += String.format("%-10s%10.2f%n", names.get(i), prices.get(i));
		}
	}
}