package pattern.creational.prototype.assignment;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private final List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void render(){
        for (Component component : components)
            System.out.println(component);
    }
}
