package pattern.structural.flyweight.assignment;

public class FontStyle {
    private final FontType fontFamily;
    private final int fontSize;
    private final boolean isBold;

    public FontStyle(FontType fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    public FontType getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean isBold() {
        return isBold;
    }

}
