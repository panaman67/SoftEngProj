import java.util.*;

public class Payment
{
	enum Type {NONE, CREDIT, DEBIT};

	public static Type type = Type.NONE;

	static void payWithCash(float total)
	{
		Scanner stdin = new Scanner(System.in);
		float payment = 0f;

		int remaining = (int)(total * 100);
		System.out.println(String.format("Total: %.2f", (float)remaining / 100));

		while (remaining > 0)
		{
			System.out.print("Deposit cash: ");
			try
			{
				payment = stdin.nextFloat();
				remaining -= (int)(payment * 100);
				System.out.println(String.format("Current total: $%.2f", (float)remaining / 100));
			}
			catch (NumberFormatException nfe)
			{
				System.out.println("Incorrect format");
			}
		}
		if (remaining < 0)
			System.out.println(String.format("Cash back is: %.2f", (float)-remaining));
		System.out.println("Thank you for shopping with us! Have a nice day!");
	}

	static void payWithCard(float total)
	{
		System.out.println("Processing payment....");
		System.out.println("Payment completed. Have a nice day");
	}
}