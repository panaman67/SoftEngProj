import java.io.*;
import java.util.HashMap;

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

    static void printRevenue(){
        TransactionHistory hist = TransactionHistory.getInstance();
        try {
            PrintWriter out = new PrintWriter(new FileWriter("dailyReport.txt"));
            HashMap<String, Integer> map = prepareItemData();

            for(String s : map.keySet()){
                out.printf("%s sold: %d\n", s, map.get(s));
            }

            out.printf("Total revenue: $%.2f\n", prepareTotals());

            out.close();

        }
        catch(IOException e){

        }
    }

    static HashMap<String, Integer> prepareItemData(){
        TransactionHistory hist = TransactionHistory.getInstance();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(String item : hist.items){
            if(map.containsKey(item)){
                map.put(item, map.get(item) + 1);
            }
            else{
                map.put(item, 1);
            }
        }
        return map;
    }

    static float prepareTotals(){
        TransactionHistory hist = TransactionHistory.getInstance();

        float total = 0;
        for(Float f : hist.totals){
            total += f;
        }
        return total;
    }

}
