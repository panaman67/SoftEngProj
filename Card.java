
public class CardReader {


public enum CardType {
CREDIT, DEBIT
}

static CardType readCardType() {
    return CREDIT; //make it actually do it later
}

static String readCardInformation() {
    return "hahaha you almost baited me into revealing sensitive data";
}

static void doTheThing(AuthCenter auth, Scanner s/*, CheckoutOrder co*/) {
    CardType cardType = readCardType();
    String cardInformation = readCardInformation();
    boolean goodNice;
    switch (cardType) {
    case DEBIT:
        System.out.println("gimme pin");
        int flangus = s.nextInt();
        goodNice = auth.authDebit(cardInformation, flangus)
        break;
    case CREDIT:
        goodNice = auth.authCredit(cardInformation);
        break;
    }
        
        if (!goodNice) {
            //co.cancel();
            return;
        } else {
            int code = auth.getCode();
            System.out.println("ahaha I'm printing receipt");
            System.out.println("last 4 of card: " + cardInformation.subString(cardInformation.length() - 5));
            System.out.println("authcode: " + code);
        }
        
        
    }
}

}
