package pattern.behavioural.command.assignment;

public class CaptureVideoCommand implements Command{
    private final History history;

    public CaptureVideoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute(String state) {
        System.out.println("Modifying the video state.");
        this.history.push(state);
    }
}
