package pattern.structural.facade;

// This is basically the facade.
public class NotificationService {

    public void send(String message, String targetIp){
        Message clientMessage = new Message(message);
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("targetIp");
        AuthToken authToken = server.authenticate("ApplicationId", "Token");
        server.send(authToken,clientMessage,targetIp);
        connection.disconnect();
    }
}
