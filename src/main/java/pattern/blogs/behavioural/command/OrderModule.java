package pattern.blogs.behavioural.command;

import pattern.blogs.behavioural.command.lib.ApplicationConstruct;

public class OrderModule implements ApplicationConstruct {

    @Override
    public void execute() {
        System.out.println("Order module is being evaluated.");
    }
}
