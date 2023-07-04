package pattern.creational.factory.framework;

import pattern.creational.factory.UserDefinedController;

public class Driver {
    public static void main(String[] args) {
        new UserDefinedController().listProducts();
    }
}
