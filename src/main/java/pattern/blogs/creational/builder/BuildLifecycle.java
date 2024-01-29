package pattern.blogs.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class BuildLifecycle {
    private final List<Build> buildPipeline = new ArrayList<>();

    public void addBuildStep(Build build){
        buildPipeline.add(build);
    }

    public void execute(BuildConfiguration buildConfiguration){

        for(Build build : buildPipeline)
            buildConfiguration.addBuildStep(build);

        buildConfiguration.execute();
    }
}
