package pattern.blogs.creational.builder;

public interface BuildConfiguration {
    void addBuildStep(Build build);

    void execute();
}
