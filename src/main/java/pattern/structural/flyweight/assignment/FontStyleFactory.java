package pattern.structural.flyweight.assignment;

import java.util.HashMap;
import java.util.Map;

public class FontStyleFactory {
    private final Map<FontType,FontStyle> fontStyleFactory = new HashMap<>();

    public FontStyle getFontStyle(FontType fontType){
        if(!fontStyleFactory.containsKey(fontType))
            fontStyleFactory.put(fontType,new FontStyle(fontType,23, true));
        return fontStyleFactory.get(fontType);
    }
}
