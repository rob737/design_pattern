package pattern.structural.adapter;

import pattern.structural.adapter.lib.Caramel;

public class Driver {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelAdapter(new Caramel()));
    }
}
