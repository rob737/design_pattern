package pattern.blogs.creational.builder;

public class Build {
    private final String id;
    private final String description;

    public Build(String id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Build{");
        sb.append("id='").append(id).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
