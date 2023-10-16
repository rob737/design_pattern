package pattern.blogs.behavioural.template.core;

public class ComputationController extends Controller{

    @Override
    protected void doExecute() {
        System.out.println("Activity delegated to Computation Controller.");
    }
}
