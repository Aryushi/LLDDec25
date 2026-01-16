package designpatterns.factory;

import designpatterns.factory.menu.AndroidUIFactory;
import designpatterns.factory.menu.IOSUIFactory;

public class UIFactoryFactory {
    public UIFactory getUIFactoryForPlatform(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        }
        else if(platform.equals(SupportedPlatform.IOS)){
            return new IOSUIFactory();
        }
        else{
            return null;
        }
    }
}
