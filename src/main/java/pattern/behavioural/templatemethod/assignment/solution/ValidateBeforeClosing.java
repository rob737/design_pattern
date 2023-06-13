package pattern.behavioural.templatemethod.assignment.solution;

public class ValidateBeforeClosing extends Window{
    protected void beforeClose(){
        System.out.println("validating before closing the window.");
    }
}
