package pattern.blogs.behavioural.memento;

/*
* Originator as it is the one creating the memento.
* */
public class CheckIn {
    private String content;
    private final CommitLog commitLog = new CommitLog();

    // This commit (memento) can be stored in history.
    void checkInChanges(String commitContent){
        this.content = commitContent;
        // Delegating to commitLog class.
        commitLog.logCommit(new Commit(commitContent));
    }

    String revert(){
        this.content = commitLog.revertCommit().getContent();
        return content;
    }

    public String getContent() {
        return content;
    }

}
