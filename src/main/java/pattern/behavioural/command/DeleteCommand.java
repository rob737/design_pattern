package pattern.behavioural.command;

public class DeleteCommand implements CallbackRef{
    @Override
    public void click() {
        System.out.println("Implementing callback reference via command pattern.");
    }
}
