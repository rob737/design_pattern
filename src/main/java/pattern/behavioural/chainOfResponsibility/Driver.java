package pattern.behavioural.chainOfResponsibility;


public class Driver {
    public static void main(String[] args) {
        ConsoleLogger logger = new ConsoleLogger(null);
        NaiveCompressor compressor = new NaiveCompressor(logger);
        PasswordAuthenticator authenticator = new PasswordAuthenticator(compressor);
        WebServer server = new WebServer(authenticator);
        HttpRequest request = new HttpRequest("admin","1234");
        server.handle(request);
    }
}
