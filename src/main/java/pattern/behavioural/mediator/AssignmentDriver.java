package pattern.behavioural.mediator;

import pattern.behavioural.mediator.assignment.*;
import pattern.behavioural.mediator.assignment.Button;
import pattern.behavioural.mediator.assignment.TextBox;

public class AssignmentDriver {
    public static void main(String[] args) {
        SignUpDialogBox signUpDialogBox = new SignUpDialogBox();
        signUpDialogBox.simulateMediator();
    }
}
