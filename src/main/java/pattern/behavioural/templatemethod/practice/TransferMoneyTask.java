package pattern.behavioural.templatemethod.practice;

public class TransferMoneyTask extends FinancialTask {

    @Override
    protected void doExecute() {
        System.out.println("Transferring money");
    }

/*    public void execute(){
        super.record(new AuditTrail());
        System.out.println("Transferring money");
    }*/
}
