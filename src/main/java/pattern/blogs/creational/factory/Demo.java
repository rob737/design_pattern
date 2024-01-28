package pattern.blogs.creational.factory;

import pattern.blogs.creational.factory.lib.Connection;
import pattern.blogs.creational.factory.lib.Driver;

public class Demo {
    public static void main(String[] args) {
        // Option to select either default driver or custom driver can be provided on UI via dropdown.
        Driver driver = new CustomDriver();
        Connection connection = driver.connect("db_service_url");
        System.out.println(connection);
    }
}
