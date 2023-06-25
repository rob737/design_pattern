package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final List<Object> objects = new ArrayList<>();

    public void add(Object object){
        objects.add(object);
    }

    public void render(){
        for(Object object : objects){
            if(object instanceof  Shape)
                ((Shape)object).render();
            else if(object instanceof Group)
                ((Group) object).render();
        }
    }
}
