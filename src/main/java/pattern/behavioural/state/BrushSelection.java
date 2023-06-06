package pattern.behavioural.state;

public class BrushSelection implements ToolActionSelection{
    @Override
    public void performOnMouseSelection() {
        System.out.println("Brush icon selected");
    }
}
