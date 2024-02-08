package pattern.blogs.creational.abstractfactory;

public class FundAccountingDownstream implements Downstream{

    @Override
    public void createDownstream(Settlement settlementSystem) {
        settlementSystem.recordTransaction();
    }
}
