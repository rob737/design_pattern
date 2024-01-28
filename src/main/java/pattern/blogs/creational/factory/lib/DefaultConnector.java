package pattern.blogs.creational.factory.lib;

public class DefaultConnector implements Connector{

    @Override
    public Connection connect(String url) {
        // write logic to connect to underlying DB using Default Connector.
        return new Connection("postgres","5432");
    }
}
