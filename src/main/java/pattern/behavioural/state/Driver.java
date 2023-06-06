package pattern.behavioural.state;

public class Driver {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        ToolActionSelection actionSelected = new CaptureSelection();

        canvas.mouseSelect(actionSelected);
    }
}
