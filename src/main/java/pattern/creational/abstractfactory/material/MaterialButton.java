package pattern.creational.abstractfactory.material;

import pattern.creational.abstractfactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering material button.");
    }
}
