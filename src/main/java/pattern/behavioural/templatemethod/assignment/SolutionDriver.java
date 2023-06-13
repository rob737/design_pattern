package pattern.behavioural.templatemethod.assignment;

import pattern.behavioural.templatemethod.assignment.solution.AfterCloseLogger;
import pattern.behavioural.templatemethod.assignment.solution.ValidateBeforeClosing;
import pattern.behavioural.templatemethod.assignment.solution.Window;

public class SolutionDriver {
    public static void main(String[] args) {
       // Window window = new AfterCloseLogger();
        // Very well explained the concept of late binding here.
        Window window = new ValidateBeforeClosing();
        window.close();
    }
}
