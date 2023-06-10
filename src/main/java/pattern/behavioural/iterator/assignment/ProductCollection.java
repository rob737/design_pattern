package pattern.behavioural.iterator.assignment;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public ProductIterator<Product> getIterator(){
        return new ListIterator(this);
    }

    private static class ListIterator implements ProductIterator<Product>{
        ProductCollection productCollection;
        int index;

        ListIterator(ProductCollection productCollection){
            this.productCollection = productCollection;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }

        @Override
        public boolean hasNext() {
            return index<productCollection.products.size();
        }
    }

}
