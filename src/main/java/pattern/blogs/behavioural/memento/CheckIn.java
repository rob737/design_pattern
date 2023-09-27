package pattern.blogs.behavioural.memento;

// Originator Class which initiates the Revert/Undo operation.
public class CheckIn {
    private final CommitHistory commitHistory = new CommitHistory();


    public void commitRecord(Commit commit) {
        commitHistory.storeCommit(commit);
    }

    public void revert(){
        commitHistory.revertCommit();
    }

    public Commit loadLatestSnapshot() {
        return commitHistory.getLatestCommit();
    }
}
