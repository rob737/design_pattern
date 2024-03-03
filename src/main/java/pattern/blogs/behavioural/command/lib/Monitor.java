package pattern.blogs.behavioural.command.lib;

public class Monitor {
    private final ServiceCommand serviceCommand;

    public Monitor(ServiceCommand serviceCommand) {
        this.serviceCommand = serviceCommand;
    }

    // This same method can be used as callback from different trigger point.
    public void monitor(){
        serviceCommand.execute();
    }
}
