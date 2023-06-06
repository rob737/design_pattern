package pattern.behavioural.state;

public class EraserDraw implements ToolActionRelease{
    @Override
    public void performOnMouseRelease() {
        System.out.println("Erase something");
    }
}
