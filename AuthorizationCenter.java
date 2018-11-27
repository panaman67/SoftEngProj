public class AuthorizationCenter {

    public boolean authorize(String cardNum){
        return cardNum.length() == 16;
    }

}
