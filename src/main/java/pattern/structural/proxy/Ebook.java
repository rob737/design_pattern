package pattern.structural.proxy;
/*
 * The problem with commented implementation is even though a reader will read only one file at a time,
 * still we are loading all the files that were added in the ebook library.
 * This would bloat up the memory and if library grows large then it would lead to app crash as well.
 * We can mitigate this by implementing lazy loading using proxy pattern.
 * */
public class Ebook {
    private final String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("Loading ebook : " + fileName);
    }

    public void show(){
        System.out.println("Showing ebook : " + fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
