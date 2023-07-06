package pattern.creational.abstractfactory.ant;

import pattern.creational.abstractfactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public void createButton() {
        System.out.println("Rendering Ant Button.");
    }

    @Override
    public void createTextBox() {
        System.out.println("Rendering Ant TextBox");
    }
}
