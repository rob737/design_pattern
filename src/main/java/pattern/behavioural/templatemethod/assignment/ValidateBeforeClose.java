package pattern.behavioural.templatemethod.assignment;

public class ValidateBeforeClose extends WindowBeforeAction{
    @Override
    protected void beforeClose() {
        System.out.println("Validating before closing window.");
    }
}
