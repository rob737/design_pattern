package pattern.blogs.structural.bridge;

public interface User {
    void buyMedicine(String medicineName);
    void createHealthCheckupAppointment(String userId);
    void createDoctorConsultation(String userId);
    void creditCashback(String userId);
    void createPriorityConsultation(String userId);
    void createDiscountedPrice(String medicineName);
    void waiveOffAnnualMembership(String userId);
}
