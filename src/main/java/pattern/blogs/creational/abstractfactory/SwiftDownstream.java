package pattern.blogs.creational.abstractfactory;

public class SwiftDownstream implements Downstream{

    @Override
    public void createDownstream(Settlement settlementSystem) {
        settlementSystem.recordTransaction();
    }
}
