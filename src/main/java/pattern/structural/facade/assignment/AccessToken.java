package pattern.structural.facade.assignment;

public class AccessToken {

    public static String getAccessToken(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        return oauth.getAccessToken(requestToken);
    }
}
