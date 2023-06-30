package pattern.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, EbookBlueprint> ebooks = new HashMap<>();

    public void add(EbookBlueprint ebook){
        ebooks.put(ebook.getFileName(),ebook);
    }

    public void openEbook(String filename){
        ebooks.get(filename).show();
    }
}
