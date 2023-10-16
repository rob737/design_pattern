package pattern.blogs.behavioural.template.core;

public class NotificationController extends Controller{

    @Override
    protected void doExecute() {
        System.out.println("Activity delegated to Notification Controller.");
    }
}
