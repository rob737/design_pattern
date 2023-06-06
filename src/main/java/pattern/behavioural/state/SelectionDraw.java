package pattern.behavioural.state;

public class SelectionDraw implements ToolActionRelease{
    @Override
    public void performOnMouseRelease() {
        System.out.println("Draw dashed rectangle");
    }
}
