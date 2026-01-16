package designpatterns.factory.menu;

import designpatterns.factory.UIFactory;
import designpatterns.factory.buttons.AndroidButton;
import designpatterns.factory.buttons.Button;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu creatMenu() {
        return new AndroidMenu();
    }
}
