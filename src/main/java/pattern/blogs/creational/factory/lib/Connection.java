package pattern.blogs.creational.factory.lib;

public class Connection {
    String connectionId;
    String port;

    public Connection(String connectionId, String port) {
        this.connectionId = connectionId;
        this.port = port;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Connection{");
        sb.append("connectionId='").append(connectionId).append('\'');
        sb.append(", port='").append(port).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
