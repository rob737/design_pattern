package pattern.behavioural.mediator;

/*
* This is the class that would act as event handler which in turn decides
* the actions that needs to be performed based on the source of the event.
*
* */
public class MediatorImpl extends ComponentMediator{
    private ListBox listBox = new ListBox(this);
    private TextBox textBox = new TextBox(this);
    private Button button = new Button(this);

    // Basically, this is acting as event handler.
    @Override
    void convey(UiControl uiControl) {
        // How are references same?
        /*
        * Answer : trigger point is Driver class which instantiates MediatorImpl class.
        * Above instance privately instantiates listBox object.
        * Mediator object calls simulateUserInteraction which in turn call
        *setSelection method using same instance of listBox.
        * so, technically one instance is being referenced everywhere.
        * */
        if(uiControl == listBox)
            performListOperations();
        else if (uiControl == textBox)
            performTextOperations();
    }

    @Override
    protected void simulateUserInteraction(){
        listBox.setSelection("Test");
        System.out.println("TextBox : " + textBox.getContent());
        System.out.println("Button : " + button.isEnabled());
        textBox.setContent("TEst textbox");
        System.out.println("Button : " + button.isEnabled());
    }

    private void performTextOperations() {
        System.out.println("called as text");
        String content = textBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        button.setEnabled(!isEmpty);
    }

    private void performListOperations() {
        System.out.println("Called as List");
        textBox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }
}
