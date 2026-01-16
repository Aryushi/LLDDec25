package designpatterns.factory;

import designpatterns.factory.buttons.Button;
import designpatterns.factory.menu.Menu;

//In this factory Interface we are only going to have factory methods
public interface UIFactory {
    Button createButton();
    Menu creatMenu();
}
