package pattern.blogs.behavioural.chainOfResponsibility;

public class UnitTestJob extends BuildJob {

    public UnitTestJob(BuildJob next) {
        super(next);
    }

    @Override
    protected boolean isExecuteJobSuccess(String pipelineId) {
        System.out.println("Completed Unit Test Execution for pipeline : " + pipelineId + " in 10 secs");
        return true;
    }
}
