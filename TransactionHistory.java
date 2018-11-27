import java.util.ArrayList;

public class TransactionHistory {
    private static TransactionHistory INSTANCE;
    ArrayList<String> items;
    ArrayList<Float> totals;

    private TransactionHistory()
    {
        items = new ArrayList<>();
        totals = new ArrayList<>();
    }

    public static TransactionHistory getInstance()
    {
        if (INSTANCE == null)
            INSTANCE = new TransactionHistory();
        return INSTANCE;
    }
}
