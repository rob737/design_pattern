package pattern.blogs.structural.bridge;

public class GoldPlan extends BasicPlan{

    public GoldPlan(User user) {
        super(user);
    }

    public void createDoctorConsultation(String userId){
        user.createDoctorConsultation(userId);
    }

    public void creditCashback(String userId){
        user.creditCashback(userId);
    }
}
