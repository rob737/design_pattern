package pattern.behavioural.templatemethod.assignment.solution;

public class AfterCloseLogger extends Window{

    protected void afterClose(){
        System.out.println("Logger is consoling after window is closed.");
    }
}
