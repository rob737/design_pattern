package pattern.blogs.creational.factory;

import pattern.blogs.creational.factory.lib.Connector;
import pattern.blogs.creational.factory.lib.Driver;

public class CustomDriver extends Driver {

    protected Connector getDbConnector(){
        return new CustomConnector();
    }
}
