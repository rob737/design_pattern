package pattern.blogs.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class StagingConfiguration implements BuildConfiguration{
    List<Build> stagingBuild = new ArrayList<>();

    @Override
    public void addBuildStep(Build build) {
        stagingBuild.add(build);
    }

    @Override
    public void execute() {
        for(Build build : stagingBuild)
            System.out.println(build);
    }

}
