package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    private final List<Component> components = new ArrayList<>();

    // Late binding will happen here.
    public void add(Component component){
        components.add(component);
    }

    @Override
    public void render(){
        /*for(Object object : objects){
            if(object instanceof  Shape)
                ((Shape)object).render();
            else if(object instanceof Group)
                ((Group) object).render();
        }*/
        for(Component component : components)
            component.render();
    }
}
