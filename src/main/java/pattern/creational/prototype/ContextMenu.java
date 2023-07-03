package pattern.creational.prototype;

public class ContextMenu {
    public Component duplicate(Component component){
        // cloning circle.
        /*if(component instanceof Circle){
            Circle source = (Circle) component;
            Circle target = new Circle(source.getRadius());
        }*/
        return component.duplicate();
    }
}
