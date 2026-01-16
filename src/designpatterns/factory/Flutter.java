package designpatterns.factory;

import designpatterns.factory.menu.AndroidUIFactory;
import designpatterns.factory.menu.IOSUIFactory;

public class Flutter {
    void refreshUI(){
        System.out.println("Refreshing UI");
    }
    void setTheme(){
        System.out.println("Setting Theme");
    }
    UIFactoryFactory uiFactoryFactory;
    public UIFactory getUIFactoryForPlatform(SupportedPlatform platform){
        return uiFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
