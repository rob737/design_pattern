package pattern.behavioural.state;

public class BrushDraw implements ToolActionRelease{
    @Override
    public void performOnMouseRelease() {
        System.out.println("Draw a line");
    }
}
