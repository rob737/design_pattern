package pattern.blogs.behavioural.chainOfResponsibility;

public class MigrationJob extends BuildJob {

    public MigrationJob(BuildJob next) {
        super(next);
    }

    @Override
    protected boolean isExecuteJobSuccess(String pipelineId) {
        // Here, we can have logic to validate if migration was successfully completed or not.
        System.out.println("Completed Executing DB scripts for pipeline : " + pipelineId + " in 2 mins");
        return true;
    }
}
