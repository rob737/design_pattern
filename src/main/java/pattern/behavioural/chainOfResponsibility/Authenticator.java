package pattern.behavioural.chainOfResponsibility;

public interface Authenticator{
    boolean authenticate(HttpRequest request);
}
