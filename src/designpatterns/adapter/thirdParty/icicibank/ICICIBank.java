package designpatterns.adapter.thirdParty.icicibank;

public class ICICIBank {
    public void makePayment(String to, String from, int amount){
        System.out.println("Tranferring money via ICICI Bank");
    }
}
