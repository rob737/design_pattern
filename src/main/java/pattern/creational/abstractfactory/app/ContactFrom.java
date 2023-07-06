package pattern.creational.abstractfactory.app;

import pattern.creational.abstractfactory.Theme;
import pattern.creational.abstractfactory.WidgetFactory;
import pattern.creational.abstractfactory.ant.AntButton;
import pattern.creational.abstractfactory.ant.AntTextBox;
import pattern.creational.abstractfactory.material.MaterialButton;
import pattern.creational.abstractfactory.material.MaterialTextBox;

public class ContactFrom {

    public void render(WidgetFactory widgetFactory){
        widgetFactory.createButton();
        widgetFactory.createTextBox();
        /*if(theme == Theme.ANT){
            new AntButton().render();
            new AntTextBox().render();
        }else if(theme == Theme.MATERIAL){
            new MaterialButton().render();
            new MaterialTextBox().render();
        }*/
    }

}
