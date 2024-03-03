package pattern.blogs.behavioural.command;

import pattern.blogs.behavioural.command.lib.ApplicationConstruct;

public class UserModule implements ApplicationConstruct {

    @Override
    public void execute() {
        System.out.println("UserModule is being evaluated.");

    }
}
