package pattern.creational.singleton.assignment;

public class AssignmentDriver {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.setFileName("singleton.txt");
        logger.write("Singleton pattern assignment");
        logger.setFileName("singleton-assignment.txt");
        logger.write("assignment");
    }
}
