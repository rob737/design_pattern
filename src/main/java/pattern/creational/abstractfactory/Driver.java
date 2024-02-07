package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.ant.AntWidgetFactory;
import pattern.creational.abstractfactory.app.ContactFrom;
import pattern.creational.abstractfactory.material.MaterialWidgetFactory;

public class Driver {
    public static void main(String[] args) {
        ContactFrom contactFrom = new ContactFrom();
        // render a family of Ant Themed widget.
        contactFrom.render(new MaterialWidgetFactory());
    }
}
