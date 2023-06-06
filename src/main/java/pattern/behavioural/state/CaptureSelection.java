package pattern.behavioural.state;

public class CaptureSelection implements ToolActionSelection{

    @Override
    public void performOnMouseSelection() {
        System.out.println("Selection icon selected");
    }
}
