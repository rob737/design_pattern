package pattern.blogs.structural.bridge;

public class Doctor implements User{
    @Override
    public void buyMedicine(String medicineName) {
        System.out.println("Doctor bought medicine : " + medicineName);
    }

    @Override
    public void createHealthCheckupAppointment(String userId) {
        System.out.println("Doctor : Health Checkup Appointment created for user : " + userId);
    }

    @Override
    public void createDoctorConsultation(String userId) {
        System.out.println("Doctor : In house Doctor Consultation booked for user : " + userId);
    }

    @Override
    public void creditCashback(String userId) {
        System.out.println("Doctor : cashback credited for user : " + userId);
    }

    @Override
    public void createPriorityConsultation(String userId) {
        System.out.println("Doctor : priority consultation booked for user : " + userId);
    }

    @Override
    public void createDiscountedPrice(String medicineName) {
        System.out.println("Doctor : discounted price applicable for medicine : " + medicineName);
    }

    @Override
    public void waiveOffAnnualMembership(String userId) {
        System.out.println("Doctor : Annual membership waived off for user : " + userId);
    }
}
