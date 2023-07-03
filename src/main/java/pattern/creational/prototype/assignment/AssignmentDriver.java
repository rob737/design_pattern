package pattern.creational.prototype.assignment;

public class AssignmentDriver {
    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        ContextMenu contextMenu = new ContextMenu(timeline);
        contextMenu.duplicate(new Audio());
        contextMenu.duplicate(new Clip());
        contextMenu.duplicate(new Text("Prototype pattern"));
        timeline.render();
    }
}
