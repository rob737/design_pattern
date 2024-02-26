package pattern.blogs.structural.facade;

public class DbClient {
    public static void main(String[] args) {
        /*
        * Assumption : We have already provisioned an authentication token using different service.
        * */
        String token = "e@345kjfd#45$%^J";
        String url = "clouddb:5432?schema=test";
        String query = "select count(1) from employee";

        CloudDb cloudDb = new CloudDb(token,url);
        cloudDb.execute(query);
    }
}
