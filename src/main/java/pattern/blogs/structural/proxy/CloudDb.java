package pattern.blogs.structural.proxy;

public class CloudDb implements Resource{
    private final String userPlan;

    public CloudDb(String userPlan) {
        this.userPlan = userPlan;
    }

    @Override
    public void execute(String query) {
        System.out.println("Query execution started for User plan : " + userPlan );

        System.out.println(query);

        System.out.println("Query execution completed ...");
    }
}
