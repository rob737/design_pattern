package pattern.creational.abstractfactory.material;

import pattern.creational.abstractfactory.WidgetFactory;

// This is one family i.e. material theme is applied on all components or a group of components.
public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public void createButton() {
        System.out.println("Rendering material button.");
    }

    @Override
    public void createTextBox() {
        System.out.println("Rendering material text box.");
    }
}
