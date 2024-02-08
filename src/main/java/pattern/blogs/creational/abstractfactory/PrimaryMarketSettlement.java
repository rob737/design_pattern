package pattern.blogs.creational.abstractfactory;

public class PrimaryMarketSettlement implements Settlement {
    private final Record record;

    public PrimaryMarketSettlement(Record record) {
        this.record = record;
    }

    @Override
    public void recordTransaction() {
        System.out.println(record + " settled in Primary Market.");
    }
}
