package pattern.blogs.behavioural.memento;

/*
* Memento : This is the object defining the changes in each commit.
* */
public class Commit {
    // We have the same field as originator because we need to keep track of changes.
    private final String content;

    public Commit(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }


}
