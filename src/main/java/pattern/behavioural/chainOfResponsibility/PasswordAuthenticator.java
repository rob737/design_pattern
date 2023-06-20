package pattern.behavioural.chainOfResponsibility;

import java.util.concurrent.Executors;

public class PasswordAuthenticator extends Handler implements Authenticator{

    public PasswordAuthenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean authenticate(HttpRequest request) {
        return !(request.getUsername().equals("admin") && request.getPassword().equals("1234"));
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Request is authenticated.");
        return authenticate(request);
    }
}
