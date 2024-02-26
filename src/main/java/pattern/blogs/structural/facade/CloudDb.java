package pattern.blogs.structural.facade;

import pattern.blogs.behavioural.template.core.AuthenticateRequest;

public class CloudDb {

    /*
    * Assumption : There is a separate service using which client gets authentication token which
    * gets validated here.
    * */
    private final String authenticationToken;
    private final String url;

    public CloudDb(String token, String url) {
        this.authenticationToken = token;
        this.url = url;
    }

    public void execute(String query) {
        Authentication authentication = new Authentication();
        authentication.authenticateToken(authenticationToken);
        Connection connection = new Connection().connect(url);

        QueryExecutor queryExecutor = new QueryExecutor(query);
        queryExecutor.execute();

        connection.disconnect();
    }

}
