package designpatterns.factory.buttons;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("clicking IOS Button");
    }
}
