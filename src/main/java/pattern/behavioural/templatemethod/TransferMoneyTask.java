package pattern.behavioural.templatemethod;

public class TransferMoneyTask extends FinancialTask {

    public void execute(){
        super.record(new AuditTrail());
        System.out.println("Transferring money");
    }
}
