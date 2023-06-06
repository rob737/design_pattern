package pattern.behavioural.state;

public class EraserSelection implements ToolActionSelection{
    @Override
    public void performOnMouseSelection() {
        System.out.println("Eraser icon selected");
    }
}
