package pattern.blogs.creational.abstractfactory;

public class Demo {
    static void settleTransaction(){
        Record record = new Record(1, "Share sold", 250.50);
        PrimaryMarketSettlement primaryMarketSettlement = new PrimaryMarketSettlement(record);

        Downstream downstream = new SwiftDownstream();

        downstream.createDownstream(primaryMarketSettlement);
    }
}
