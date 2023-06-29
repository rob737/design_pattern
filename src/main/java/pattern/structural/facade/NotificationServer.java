package pattern.structural.facade;

public class NotificationServer {
    // connect () -> Connection
    // authenticate(appId, token) -> AuthToken
    // send(authToken, message, target) -> void
    // Connection.disconnect() -> void

    public Connection connect(String targetIp) {
        return new Connection(targetIp);
    }

    public AuthToken authenticate(String appId, String token){
        return new AuthToken(appId,token);
    }

    public void send(AuthToken authToken, Message message, String target){
        System.out.println("Sending message");
    }

}
