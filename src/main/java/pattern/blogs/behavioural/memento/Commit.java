package pattern.blogs.behavioural.memento;

// Memento which signifies the Element that would be reverted.
public class Commit {
    private int id;
    private String Description;

    public Commit(int id, String description) {
        this.id = id;
        Description = description;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Commit{");
        sb.append("id=").append(id);
        sb.append(", Description='").append(Description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
