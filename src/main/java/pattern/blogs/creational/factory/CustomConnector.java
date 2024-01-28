package pattern.blogs.creational.factory;

import pattern.blogs.creational.factory.lib.Connection;
import pattern.blogs.creational.factory.lib.Connector;

public class CustomConnector implements Connector {
    @Override
    public Connection connect(String url) {
        // write custom logic to connect to underlying db which is more suited to your use case.
        return new Connection("custom","5433");
    }
}
