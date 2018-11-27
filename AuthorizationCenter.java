import java.util.Random;

public class AuthorizationCenter {

    static int authorize(String cardNum, String pin){
        if(cardNum.length() == 16 && pin.length() == 4){
            return (new Random()).nextInt(9999);
        }
        else{
            return 0;
        }
    }
    static int authorize(String cardNum){
        if(cardNum.length() == 16){
            return (new Random()).nextInt(9999);
        }
        else{
            return 0;
        }
    }

}
