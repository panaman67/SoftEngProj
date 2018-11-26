import java.util.*;

public class Payment
{
	enum Type {NONE, CREDIT, DEBIT};

	public static Type type = Type.NONE;

	static void payWithCash(float total)
	{
		Scanner stdin = new Scanner(System.in);
		float payment = 0f;

		while (total > 0.009)
		{
			System.out.print("Deposit cash: ");
			try
			{
				payment = stdin.nextFloat();
				total -= payment;
				System.out.println(String.format("Current total: $%.2f", total));
			}
			catch (NumberFormatException nfe)
			{
				System.out.println("Incorrect format");
			}
		}
		if (total < 0)
			System.out.println("Cash back is: " + -total);
		System.out.println("Thank you for shopping with us! Have a nice day!");
	}

	static void payWithCard(float total)
	{

	}
}