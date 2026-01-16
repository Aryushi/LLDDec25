package designpatterns.factory;

import designpatterns.factory.buttons.Button;
import designpatterns.factory.menu.Menu;

public class Client {
    public static void main(String[] args) {
    Flutter flutter = new Flutter();
    UIFactory uiFactory = flutter.getUIFactoryForPlatform(SupportedPlatform.ANDROID);

        Button button = uiFactory.createButton();
        button.click();

        Menu menu = uiFactory.creatMenu();
        menu.showMenu();
    }
}
