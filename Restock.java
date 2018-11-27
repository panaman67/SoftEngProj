import java.util.*;

public class Restock {

    static void restock(){

        Scanner in = new Scanner(System.in);
        Inventory inv = Inventory.getInstance();
        char action;

        System.out.println(inv);

        while(true){

            System.out.println("(S)can/(N)ew Item/(E)nd");
            action = in.nextLine().charAt(0);
            action = Character.toUpperCase(action);

            switch (action)
            {
                case 'S':
                    scanItem();
                    break;
                case 'N':
                    newItem();
                    System.out.println("New item added");
                    break;
                case 'E':
                    return;
                default:
                    System.out.println("Choice not valid, please try again.");

            }
        }

    }

    private static void scanItem(){

        Scanner stdin = new Scanner(System.in);
        Inventory inv = Inventory.getInstance();
        int item, amount;

        while (true)
        {
            try
            {
                System.out.print("What item to scan: ");
                item = Helpers.extractInt(stdin.nextLine(), inv.names.size());
                if (inv.getItemName(item - 1).length() != 0 )
                {
                    try {
                        System.out.print("How many you want to add: ");
                        amount = stdin.nextInt();
                        stdin.nextLine();

                        inv.amounts.set(item - 1, inv.getItemAmount(item - 1) + amount);
                        return;
                    }
                    catch (IndexOutOfBoundsException e){
                        continue;
                    }
                }
                System.out.println("Not valid item");
            }
            catch (IndexOutOfBoundsException e)
            {
                continue;
            }
        }
    }

    private static void newItem() {

        Scanner stdin = new Scanner(System.in);
        Inventory inv = Inventory.getInstance();
        String name;
        int quantity;
        float price;

            System.out.print("Name of new item: ");
            name = stdin.nextLine();

            System.out.print("How many to add: ");
            quantity = stdin.nextInt();
            stdin.nextLine();

            System.out.print("Price of item: ");
            price = stdin.nextFloat();
            stdin.nextLine();

            inv.names.add(name);
            inv.amounts.add(quantity);
            inv.prices.add(price);

    }
}
