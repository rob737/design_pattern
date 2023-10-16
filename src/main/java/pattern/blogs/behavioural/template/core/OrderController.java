package pattern.blogs.behavioural.template.core;

public class OrderController extends Controller{

    @Override
    protected void doExecute() {
        System.out.println("Activity delegated to Order controller.");
    }
}
