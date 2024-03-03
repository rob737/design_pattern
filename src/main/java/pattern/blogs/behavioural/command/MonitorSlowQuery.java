package pattern.blogs.behavioural.command;

import pattern.blogs.behavioural.command.lib.ApplicationConstruct;
import pattern.blogs.behavioural.command.lib.ServiceCommand;

public class MonitorSlowQuery implements ServiceCommand {

    private final ApplicationConstruct applicationConstruct;

    public MonitorSlowQuery(ApplicationConstruct applicationConstruct) {
        this.applicationConstruct = applicationConstruct;
    }

    @Override
    public void execute() {
        System.out.println("Slow query Log initiated. ");
        applicationConstruct.execute();
        System.out.println("Slow query Log completed.");
    }
}
