package pattern.blogs.creational.abstractfactory;

public class SecondaryMarketSettlement implements Settlement {
    private final Record record;

    public SecondaryMarketSettlement(Record record) {
        this.record = record;
    }

    @Override
    public void recordTransaction() {
        System.out.println(record + " settled in secondary market.");

    }
}
