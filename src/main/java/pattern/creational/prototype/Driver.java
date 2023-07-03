package pattern.creational.prototype;

public class Driver {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.render();
        ContextMenu contextMenu = new ContextMenu();
        System.out.println(circle);
        System.out.println(contextMenu.duplicate(circle));
    }
}
