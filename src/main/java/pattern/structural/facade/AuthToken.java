package pattern.structural.facade;

public class AuthToken {
    private final String appId, token;

    public AuthToken(String appId, String token) {
        this.appId = appId;
        this.token = token;
    }

}
