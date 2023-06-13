package pattern.behavioural.templatemethod.assignment;

public abstract class WindowBeforeAction {
    public void close(){
        beforeClose();
        System.out.println("Closing the window.");
    }
    protected abstract void beforeClose();
}
