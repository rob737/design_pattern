package pattern.blogs.creational.factory.lib;

public class Driver {

    public Connection connect(String url) {
        Connector connector = getDbConnector();
        return connector.connect(url);
    }

    protected Connector getDbConnector() {
        return new DefaultConnector();
    }

}
