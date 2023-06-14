package pattern.behavioural.command.fx;

// Initiator/Sender
public class Button {
    private String label;
    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    /*public void click(CallbackRef callbackRef){
     // this click may behave differently based on the location from where it is called upon.
     // i.e. same click() method can be used for delete, list, update, create etc.
        callbackRef.click();
    }*/

    public void click(){
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
