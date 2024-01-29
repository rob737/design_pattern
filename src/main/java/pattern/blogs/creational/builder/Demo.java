package pattern.blogs.creational.builder;

public class Demo {

    public static void triggerStagingBuild() {
        BuildLifecycle buildLifecycle = new BuildLifecycle();
        buildLifecycle.addBuildStep(new Build("1","Unit tests"));
        buildLifecycle.addBuildStep(new Build("2","Run migration"));
        buildLifecycle.addBuildStep(new Build("3","Run Seeder"));
        buildLifecycle.addBuildStep(new Build("4","Create a jar bundle"));

        StagingConfiguration stagingConfiguration = new StagingConfiguration();
        buildLifecycle.execute(stagingConfiguration);
    }

    public static void triggerProductionBuild() {
        BuildLifecycle buildLifecycle = new BuildLifecycle();
        buildLifecycle.addBuildStep(new Build("1","Unit tests"));
        buildLifecycle.addBuildStep(new Build("2","Run migration"));
        buildLifecycle.addBuildStep(new Build("3","Run Seeder"));
        buildLifecycle.addBuildStep(new Build("4","Run Vulnerability Scan"));
        buildLifecycle.addBuildStep(new Build("5","Create a jar bundle"));

        ProductionConfiguration productionConfiguration = new ProductionConfiguration();
        buildLifecycle.execute(productionConfiguration);
    }
}
