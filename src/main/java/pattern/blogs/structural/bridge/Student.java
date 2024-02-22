package pattern.blogs.structural.bridge;

public class Student implements User{

    @Override
    public void buyMedicine(String medicineName) {
        System.out.println("Student bought medicine : " + medicineName);
    }

    @Override
    public void createHealthCheckupAppointment(String userId) {
        System.out.println("Student : Health Checkup Appointment created for user : " + userId);
    }

    @Override
    public void createDoctorConsultation(String userId) {
        System.out.println("Student : In house Doctor Consultation booked for user : " + userId);
    }

    @Override
    public void creditCashback(String userId) {
        System.out.println("Student : cashback credited for user : " + userId);
    }

    @Override
    public void createPriorityConsultation(String userId) {
        System.out.println("Student : priority consultation booked for user : " + userId);
    }

    @Override
    public void createDiscountedPrice(String medicineName) {
        System.out.println("Student : discounted price applicable for medicine : " + medicineName);
    }

    @Override
    public void waiveOffAnnualMembership(String userId) {
        System.out.println("Student : Annual membership waived off for user : " + userId);
    }
}
