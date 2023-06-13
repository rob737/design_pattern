package pattern.behavioural.templatemethod;

import pattern.behavioural.templatemethod.assignment.LogAfterClose;
import pattern.behavioural.templatemethod.assignment.ValidateBeforeClose;
import pattern.behavioural.templatemethod.assignment.WindowAfterAction;
import pattern.behavioural.templatemethod.assignment.WindowBeforeAction;

public class AssignmentDriver {
    public static void main(String[] args) {
        WindowBeforeAction windowBeforeAction = new ValidateBeforeClose();
        windowBeforeAction.close();

        WindowAfterAction windowAfterAction = new LogAfterClose();
        windowAfterAction.close();
    }
}
