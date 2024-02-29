package pattern.blogs.behavioural.chainOfResponsibility;

public class Driver {

    public static void main(String[] args) {
        // Terminal job for our use case.
        UnitTestJob unitTestJob = new UnitTestJob(null);
        MigrationJob migrationJob = new MigrationJob(unitTestJob);
        SeederJob seederJob = new SeederJob(migrationJob);

        seederJob.executeNext("pipelineId : 231");
    }

}
