package pattern.blogs.structural.proxy;

import java.util.Map;

public class CloudDbProxy implements Resource{
    private final String userPlan;
    private final Map<String, Integer> limit = Map.of("free",4, "premium",1000);
    private final CloudDb cloudDb;

    public CloudDbProxy(String userPlan) {
        this.userPlan = userPlan;
        this.cloudDb = new CloudDb(userPlan);
    }

    @Override
    public void execute(String query) {
        if(limit.get(userPlan) < Math.random() * 10){
            System.out.println("Daily quota exceeded for user plan : " + userPlan);
            return;
        }
        cloudDb.execute(query);
    }
}
