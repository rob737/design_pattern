package pattern.blogs.behavioural.memento;

import java.util.Stack;

public class CommitLog {
    private final Stack<Commit> commitLog = new Stack<>();

    public void logCommit(Commit commit){
        commitLog.push(commit);
    }

    public Commit revertCommit(){
        commitLog.pop();
        return commitLog.peek();
    }
}
