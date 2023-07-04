package pattern.creational.singleton.assignment;

public class Logger {
    private String fileName;

    private static final Logger logger = new Logger();

    private Logger(){}

    public void write(String message) {
        System.out.println("Writing a message to the log file : " + fileName);
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public static Logger getLogger() {
        return logger;
    }
}
