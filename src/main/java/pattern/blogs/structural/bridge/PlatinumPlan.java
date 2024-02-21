package pattern.blogs.structural.bridge;

public class PlatinumPlan extends GoldPlan{

    public PlatinumPlan(User user) {
        super(user);
    }

    public void createPriorityConsultation(String userId){
        user.createPriorityConsultation(userId);
    }

    public void createDiscountedPrice(String medicineName){
        user.createDiscountedPrice(medicineName);
    }

    public void waiveOffAnnualMembership(String userId){
        user.waiveOffAnnualMembership(userId);
    }
}
