package pattern.blogs.behavioural.command;

import pattern.blogs.behavioural.command.lib.ApplicationConstruct;
import pattern.blogs.behavioural.command.lib.ServiceCommand;

public class MonitorMemoryLeak implements ServiceCommand {

    private final ApplicationConstruct applicationConstruct;

    public MonitorMemoryLeak(ApplicationConstruct applicationConstruct) {
        this.applicationConstruct = applicationConstruct;
    }

    @Override
    public void execute() {
        System.out.println("Memory Leak inspection started.");
        applicationConstruct.execute();
        System.out.println("Memory Leak inspection completed.");
    }
}
