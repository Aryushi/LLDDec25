package designpatterns.adapter;

public interface BankAPI {
    void sendMoney(String from, String to, int amount);
    void registerAccount(String accountNumber);
    void getBalance(String accountNumber);
}
