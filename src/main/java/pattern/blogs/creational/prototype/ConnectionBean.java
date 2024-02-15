package pattern.blogs.creational.prototype;

public class ConnectionBean implements BeanContext{
    private final int port;
    private final String url;

    public ConnectionBean(int port, String url) {
        this.port = port;
        this.url = url;
    }

    @Override
    public BeanContext cloneBean() {
        return new ConnectionBean(port,url);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConnectionBean{");
        sb.append("port=").append(port);
        sb.append(", url='").append(url).append('\'');
        sb.append(", hash = " + this.hashCode());
        sb.append('}');
        return sb.toString();
    }
}
