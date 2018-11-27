import java.util.*;

public class Payment
{
	enum Type {NONE, CREDIT, DEBIT};

	public static Type type = Type.NONE;

	static boolean payWithCash(float total)
	{
		Scanner stdin = new Scanner(System.in);
		float payment = 0f;

		int remaining = (int)(total * 100);
		System.out.println(String.format("Total: %.2f", (float)remaining / 100));

		while (remaining > 0)
		{
			System.out.print("Deposit cash or enter '0' to cancel: ");
			try
			{
				payment = stdin.nextFloat();
				if(payment == 0){
					return false;
				}
				remaining -= (int)(payment * 100);
				System.out.println(String.format("Current total: $%.2f", (float)remaining / 100));
			}
			catch (NumberFormatException nfe)
			{
				System.out.println("Incorrect format");
			}
		}
		if (remaining < 0)
			System.out.println(String.format("Cash back is: %.2f", (float)-remaining/100));
		System.out.println("Thank you for shopping with us! Have a nice day!");
		return true;
	}

	static boolean payWithCard(float total)
	{
		Scanner in = new Scanner(System.in);
		String cardNum, pin;

		System.out.println("Please input your card number, or enter 0 to cancel: ");
		cardNum = in.nextLine();
		if(cardNum.equals("0"))
			return false;

		//check if card is debit
		if(cardNum.charAt(0) == '1'){
			System.out.println("Please enter your PIN: ");
			pin = in.nextLine();
			int authcode = AuthorizationCenter.authorize(cardNum, pin);
			if(authcode == 0){
				System.out.println("Card is not accepted, please enter new payment");
				return Customer.payBill(total);
			}
			else{
				System.out.println("Payment accepted, printing receipt!");
				System.out.println(cardNum.substring(11) + Integer.toString(authcode) + "\n\n");
				return true;
			}
		}
		else{
			int authcode = AuthorizationCenter.authorize(cardNum);
			if(authcode == 0){
				System.out.println("Card declined, ejecting");
				return false;
			}
			else{
				System.out.println("Payment accepted, printing receipt!");
				System.out.println(cardNum.substring(11) + Integer.toString(authcode) + "\n\n");
				return true;
			}

		}
	}
}