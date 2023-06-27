package pattern.structural.decorator;

public class Driver {
    /*
    * The problem here is that let's say we have too many combinations of
    * features like compression, encryption etc then we would need to
    * create too many subclasses like we did for Encryption/compression which is not maintainable.
    *
    * Instead, we can leverage decorator pattern to achieve it in a maintainable way.
    * */
    public static void main(String[] args) {
        CloudStream cloudStream = new CloudStream();
        cloudStream.write("Decorator pattern implementation.");
        cloudStream = new EncryptedCloudStream();
        cloudStream.write("Decorator pattern implementation.");
    }
}
