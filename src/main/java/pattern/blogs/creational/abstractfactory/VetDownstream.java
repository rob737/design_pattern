package pattern.blogs.creational.abstractfactory;

public class VetDownstream implements Downstream{

    @Override
    public void createDownstream(Settlement settlementSystem) {
        settlementSystem.recordTransaction();
    }
}
