package pattern.blogs.behavioural.chainOfResponsibility;

public class SeederJob extends BuildJob {

    public SeederJob(BuildJob next) {
        super(next);
    }

    @Override
    protected boolean isExecuteJobSuccess(String pipelineId) {
        System.out.println("Completed Seeder Execution for pipeline : " + pipelineId + " in 1 min");
        return true;
    }
}
