package pattern.creational.abstractfactory.ant;

import pattern.creational.abstractfactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Ant Button.");
    }
}
