package pattern.behavioural.command.assignment;

public class Driver {
    public static void main(String[] args) {
        History history = new History();
        Command command = new CaptureVideoCommand(history);
        VideoEditor videoEditor = new VideoEditor(command,history);
        videoEditor.setContrast(0.5f);
        System.out.println(videoEditor.getContrast());
        videoEditor.setContrast(23.0f);
        System.out.println(videoEditor.getContrast());
        Undoable<String> undoable = new UndoVideo(history);
        undoable.undo();
        System.out.println(videoEditor.getContrast());
        videoEditor.setText("Robin");
        undoable.undo();
        System.out.println(videoEditor.getContrast());


    }
}
