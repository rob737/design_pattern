package pattern.behavioural.command.solution;

/*
* Note : If we are using abstract class then there is no need to
* implement all methods of the interface which makes sense.
* */
// Another example of template method pattern.
public abstract class AbstractUndoableCommand implements UndoableCommand{
    protected VideoEditor videoEditor;
    protected History history;

    public AbstractUndoableCommand(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
