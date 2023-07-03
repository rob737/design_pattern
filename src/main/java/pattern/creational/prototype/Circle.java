package pattern.creational.prototype;

public class Circle implements Component{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering circle with radius " + radius);
    }

    @Override
    public Component duplicate() {
        return new Circle(radius);
    }

    public int getRadius() {
        return radius;
    }
}
