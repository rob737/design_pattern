package pattern.blogs.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ProductionConfiguration implements BuildConfiguration {

    List<Build> productionBuild = new ArrayList<>();

    @Override
    public void addBuildStep(Build build) {
        productionBuild.add(build);
    }

    @Override
    public void execute() {
        for(Build build : productionBuild)
            System.out.println(build);
    }
}
