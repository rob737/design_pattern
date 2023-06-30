package pattern.structural.proxy;

public class ConcreteEbook implements EbookBlueprint{
    private final String fileName;

    public ConcreteEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("Loading ebook : " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing the ebook : " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
