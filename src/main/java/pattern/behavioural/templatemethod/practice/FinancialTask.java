package pattern.behavioural.templatemethod.practice;

public abstract class FinancialTask {
    private final AuditTrail auditTrail;

    public FinancialTask(){
        this.auditTrail = new AuditTrail();
    }

    public FinancialTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    /*
    * This ensures that code duplication is avoided and
    * also auditing is not dependent on developer's coding style
    * */
    public void record(){
        this.auditTrail.record();
        doExecute();
    }
    // This method will only be visible to inherited classes.
    protected abstract void doExecute();
}
