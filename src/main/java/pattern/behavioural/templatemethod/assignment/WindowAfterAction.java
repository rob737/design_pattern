package pattern.behavioural.templatemethod.assignment;

public abstract class WindowAfterAction {
    public void close(){
        System.out.println("Window is getting closed.");
        afterClose();
    }
    protected abstract void afterClose();
}
