package pattern.behavioural.templatemethod.practice;

/*
* There are 2 issues with current implementation :
* 1. we need to duplicate audit functionality in all the task classes.
* 2. There is no guarantee that same structure to audit would be followed by all developers.
*
* I think we can use Inheritance to solve this problem.
* */

public class GenerateReportTask extends FinancialTask {

    @Override
    protected void doExecute() {
        System.out.println("Generating report for business.");
    }
    /*private final AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }*/
/*
    public void generate(){
        super.record(new AuditTrail());
        System.out.println("Generating report for business.");
    }*/

}
