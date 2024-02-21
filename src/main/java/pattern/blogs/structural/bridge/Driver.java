package pattern.blogs.structural.bridge;

public class Driver {
    public static void main(String[] args) {
        // Based on certain criteria user can be elevated to gold, platinum plans etc.
        User user = new Student();
        /*
        * If we had not followed bridge pattern then we would need to have 3 classes defined for each plan
        * corresponding to each user type.
        * e.g. for below scenario, we would need to have a class something called as DoctorGoldPlan
        * to utilize gold plan features.
        * */
        GoldPlan plan = new GoldPlan(user);
        plan.createDoctorConsultation("User:EX1234");
    }
}
