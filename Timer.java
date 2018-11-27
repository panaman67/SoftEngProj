import java.io.*;
public class Timer {

    static void printInventory(){
        Inventory inv = Inventory.getInstance();
        try {
            PrintWriter out = new PrintWriter(new FileWriter("inventoryReport.txt"));

            for (int i = 0; i < inv.names.size(); i++) {
                out.printf("%s/%d/%.2f\n",
                        inv.names.get(i),
                        inv.amounts.get(i),
                        inv.prices.get(i));
            }
            out.close();
        }
        catch(IOException e){

        }


    }

}
