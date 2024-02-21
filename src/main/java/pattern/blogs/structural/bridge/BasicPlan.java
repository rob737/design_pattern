package pattern.blogs.structural.bridge;

public class BasicPlan {

    protected User user;

    public BasicPlan(User user) {
        this.user = user;
    }

    public void buyMedicine(String medicineName){
        user.buyMedicine(medicineName);
    }

    public void createHealthCheckupAppointment(String userId){
        user.createHealthCheckupAppointment(userId);
    }
}
