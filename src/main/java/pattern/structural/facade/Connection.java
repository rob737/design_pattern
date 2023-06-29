package pattern.structural.facade;

public class Connection {
    private final String targetIp;

    public Connection(String targetIp) {
        this.targetIp = targetIp;
    }

    public void disconnect(){
        System.out.println("Disconnected from " + targetIp);
    }
}
