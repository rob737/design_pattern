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

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
}
