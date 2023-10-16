package pattern.blogs.behavioural.template;

import pattern.blogs.behavioural.template.core.Controller;
import pattern.blogs.behavioural.template.core.NotificationController;

public class Driver {
    public static void main(String[] args) {
        Controller controller = new NotificationController();
        controller.execute();
    }
}
