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
                    scanitem();
                    System.out.println("Item added");
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

}
