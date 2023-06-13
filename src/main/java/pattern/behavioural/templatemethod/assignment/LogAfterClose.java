package pattern.behavioural.templatemethod.assignment;

public class LogAfterClose extends WindowAfterAction{

    @Override
    protected void afterClose() {
        System.out.println("Action after window is closed");
    }
}
