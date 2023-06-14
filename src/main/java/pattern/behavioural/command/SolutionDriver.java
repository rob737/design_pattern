package pattern.behavioural.command;

import pattern.behavioural.command.solution.*;

public class SolutionDriver {
    public static void main(String[] args) {
        VideoEditor videoEditor = new VideoEditor();
        History history = new History();

        // Issuer/Sender
        SetTextCommand setTextCommand = new SetTextCommand("Video title",videoEditor,history);
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        SetContrastCommand setContrastCommand = new SetContrastCommand(videoEditor,history,1);
        setContrastCommand.execute();
        System.out.println("CONTRAST: " + videoEditor);

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);


    }
}
