package pattern.behavioural.templatemethod.assignment.solution;

public class Window {
    public void close(){
        beforeClose();
        System.out.println("Closing the window.");
        afterClose();
    }
    // Empty methods are called hooks.
    protected void beforeClose(){
        System.out.println("Default validation.");
    };
    protected void afterClose(){};
}
