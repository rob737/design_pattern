package pattern.structural.adapter;

import pattern.structural.adapter.lib.Caramel;

/*
* Leverage this class as adapter to use external caramel library in our code.
* */
public class CaramelAdapter implements Filter{
    private final Caramel caramel;

    public CaramelAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
