package pattern.behavioural.command.assignment;

public class UndoVideo implements Undoable<String>{
    private final History history;

    public UndoVideo(History history) {
        this.history = history;
    }

    @Override
    public String undo() {
        System.out.println("undo previous state.");
        return this.history.pop();
    }

}
