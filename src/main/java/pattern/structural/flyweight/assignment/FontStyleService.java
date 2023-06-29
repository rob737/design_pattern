package pattern.structural.flyweight.assignment;

public class FontStyleService {
    private final FontStyleFactory fontStyleFactory;

    public FontStyleService(FontStyleFactory fontStyleFactory) {
        this.fontStyleFactory = fontStyleFactory;
    }

    public FontStyle getFontStyle(FontType fontType){
        return fontStyleFactory.getFontStyle(fontType);
    }
}
