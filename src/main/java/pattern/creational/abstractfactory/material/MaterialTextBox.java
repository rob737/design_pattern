package pattern.creational.abstractfactory.material;

import pattern.creational.abstractfactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering material text box.");
    }
}
