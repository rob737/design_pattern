package pattern.blogs.structural.bridge;

public class Patient implements User{
    @Override
    public void buyMedicine(String medicineName) {
        System.out.println("Patient bought medicine : " + medicineName);
    }

    @Override
    public void createHealthCheckupAppointment(String userId) {
        System.out.println("Patient : Health Checkup Appointment created for user : " + userId);
    }

    @Override
    public void createDoctorConsultation(String userId) {
        System.out.println("Patient : In house Doctor Consultation booked for user : " + userId);
    }

    @Override
    public void creditCashback(String userId) {
        System.out.println("Patient : cashback credited for user : " + userId);
    }

    @Override
    public void createPriorityConsultation(String userId) {
        System.out.println("Patient : priority consultation booked for user : " + userId);
    }

    @Override
    public void createDiscountedPrice(String medicineName) {
        System.out.println("Patient : discounted price applicable for medicine : " + medicineName);
    }

    @Override
    public void waiveOffAnnualMembership(String userId) {
        System.out.println("Patient : Annual membership waived off for user : " + userId);
    }
}
