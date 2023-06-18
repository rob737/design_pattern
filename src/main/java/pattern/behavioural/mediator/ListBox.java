package pattern.behavioural.mediator;

/*
* Use case : any changes in selection filed in ListBox must be received in
* TextBox object and Button object.
*
* So, basically the selected content in ListBox must be set as content in text box and button should get enabled
* without modifying ListBox class.
* */
public class ListBox extends UiControl{
    private String selection;

    public ListBox(ComponentMediator mediator) {
        super(mediator);
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        // This is needed to convey which object has changed.
        // This will enable us to make our framework generic and identify
        // the object that is changed and in concrete Mediator class we can write the interaction
        // with other object accordingly.
        mediator.convey(this);
    }
}
