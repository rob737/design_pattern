package pattern.blogs.behavioural.command;

import pattern.blogs.behavioural.command.lib.ApplicationConstruct;
import pattern.blogs.behavioural.command.lib.ServiceCommand;

public class MonitorApi implements ServiceCommand {

    private final ApplicationConstruct applicationConstruct;

    public MonitorApi(ApplicationConstruct applicationConstruct) {
        this.applicationConstruct = applicationConstruct;
    }

    @Override
    public void execute() {
        System.out.println("API performance evaluation started.");
        applicationConstruct.execute();
        System.out.println("API performance evaluation completed.");
    }
}
