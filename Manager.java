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
                    //Print option
                    break;
                case 3:
                    //Print option
                    break;
                default:
                    System.out.println("Input not valid, try again");

            }
        }
    }



}
