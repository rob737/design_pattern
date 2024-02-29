package pattern.blogs.behavioural.chainOfResponsibility;

public abstract class BuildJob {
    private final BuildJob next;

    public BuildJob(BuildJob next) {
        this.next = next;
    }

    protected void Test(){
        System.out.println("T$s");
    }

    public void executeNext(String pipelineId){
        if(!isExecuteJobSuccess(pipelineId))
            return;
        if(next != null)
            this.next.executeNext(pipelineId);
    }

    protected abstract boolean isExecuteJobSuccess(String pipelineId);
}
