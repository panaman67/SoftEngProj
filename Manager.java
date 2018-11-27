import java.util.*;

public class Manager {

    static void menu(){

        Scanner stdin = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome!\n");
            System.out.println("0: Exit");
            System.out.println("1: View/Update Inventory");
            System.out.println("2: Print Daily Report");
            System.out.println("3: Print Inventory Report");
            System.out.println("Action: ");

            switch (stdin.nextInt()) {

                case 0:
                    return;
                case 1:
                    viewOrUpdate();
                    break;
                case 2:
                    Timer.printRevenue();
                    break;
                case 3:
                    Timer.printInventory();
                    break;
                default:
                    System.out.println("Input not valid, try again");

            }
        }
    }

    private static void viewOrUpdate(){

        Scanner stdin = new Scanner(System.in);
        Inventory inv = Inventory.getInstance();
        int item;
        char choice;

        while(true){
            System.out.println(inv);
            System.out.println("Select item or enter '0' to exit");
            System.out.println("What item would you like to view/update: ");

            item = stdin.nextInt() - 1;
            stdin.nextLine();
            if(item < 0){
                return;
            }
            printItem(inv, item);

            System.out.println("Change: (N)ame/(Q)uantity/(P)rice or (B)ack");
            choice = Character.toUpperCase(stdin.nextLine().charAt(0));

            switch(choice){
                case 'N':
                    System.out.println("New name: ");
                    inv.names.set(item, stdin.nextLine());
                    break;
                case 'Q':
                    System.out.println("New quantity: ");
                    inv.amounts.set(item, stdin.nextInt());
                    stdin.nextLine();
                    break;
                case 'P':
                    System.out.println("New price: ");
                    inv.prices.set(item, stdin.nextFloat());
                    stdin.nextLine();
                    break;
                case 'B':
                    break;
            }

        }
    }

    private static void printItem(Inventory inv, int itemIndex){
        System.out.printf("Name: %s\n", inv.names.get(itemIndex));
        System.out.printf("Quantity: %d\n", inv.amounts.get(itemIndex));
        System.out.printf("Price: %f\n", inv.prices.get(itemIndex));
    }

}
