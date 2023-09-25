package pattern.blogs.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

// Caretaker which takes care of the Memento and it's lifecycle.
public class CommitHistory {
    private final List<Commit> commitRecord = new ArrayList<>();

    public void storeCommit(Commit commit){
        commitRecord.add(commit);
    }

    public void revertCommit() {
        int lastRecord = commitRecord.size() - 1;
        commitRecord.remove(lastRecord);
    }

    public Commit getLatestCommit() {
        int latestRecord = commitRecord.size() - 1;
        return commitRecord.get(latestRecord);
    }
}
