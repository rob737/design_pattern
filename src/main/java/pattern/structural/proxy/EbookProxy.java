package pattern.structural.proxy;

public class EbookProxy implements EbookBlueprint{
    private final String filename;
    private ConcreteEbook concreteEbook;

    public EbookProxy(String filename) {
        this.filename = filename;
    }

    /*
    * Lazy loading, it will load ebook only when it's being read.
    * */
    @Override
    public void show() {
        if(concreteEbook == null){
            concreteEbook = new ConcreteEbook(filename);
            System.out.println("Created new Ebook");
        }
        concreteEbook.show();
    }

    @Override
    public String getFileName() {
        return filename;
    }
}
