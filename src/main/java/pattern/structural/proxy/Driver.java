package pattern.structural.proxy;

public class Driver {
    public static void main(String[] args) {
        Library library = new Library();
        String[] filenames = {"Career","Health","Relationship","Personal Growth"};
        for (String filename : filenames)
            library.add(new EbookProxy(filename));
        library.openEbook("Health");
        library.openEbook("Career");
        library.openEbook("Health");
    }
}
