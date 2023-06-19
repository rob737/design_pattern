package pattern.behavioural.mediator.assignment;

public class SignUpDialogBox implements EventHandler{

    TextBox userName = new TextBox();
    TextBox password = new TextBox();
    CheckBox terms = new CheckBox();
    Button signup = new Button();

    public SignUpDialogBox(){
        userName.addEventHandler(this);
        password.addEventHandler(this);
        terms.addEventHandler(this);
        signup.addEventHandler(this);
    }

    @Override
    public void execute() {
        System.out.println("Mediator notified.");
        enableSignUp();
    }

    public void simulateMediator(){
        userName.setContent("Robin");
        password.setContent("passowrd");
        terms.setChecked(true);
        terms.setChecked(false);
    }

    private void enableSignUp() {
        if(!(userName.getContent() == null || password.getContent() == null || terms.isChecked() == false))
        System.out.println("Sign up button is enabled");
        else
            System.out.println("Sign up button is still disabled");
    }
}
