package pattern.creational.abstractfactory.ant;

import pattern.creational.abstractfactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering Ant TextBox");
    }
}
