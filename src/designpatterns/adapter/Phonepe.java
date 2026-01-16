package designpatterns.adapter;

public class Phonepe {
    //probably we should use dependency injection here
    private static BankAPI bankAPI = new YesBankAdapter();//cannot access mon static attributes from a static method

    public static void main(String[] args) {
        bankAPI.sendMoney("1234","5678",1000);
    }
}
