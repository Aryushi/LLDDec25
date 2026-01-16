package designpatterns.factory.menu;

import designpatterns.factory.UIFactory;
import designpatterns.factory.buttons.Button;
import designpatterns.factory.buttons.IOSButton;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu creatMenu() {
        return new IOSMenu();
    }
}
