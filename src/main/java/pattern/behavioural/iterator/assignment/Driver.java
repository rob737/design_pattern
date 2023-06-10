package pattern.behavioural.iterator.assignment;

public class Driver {
    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1,"egg"));
        productCollection.add(new Product(2, "chicken"));
        productCollection.add(new Product(3, "rice"));

        ProductIterator<Product> productIterator = productCollection.getIterator();

        while (productIterator.hasNext()){
            System.out.println(productIterator.current());
            productIterator.next();
        }
    }
}
