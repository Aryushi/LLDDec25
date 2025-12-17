package designpatterns.factory.buttons;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("clicking android button");
    }
}
