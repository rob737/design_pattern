package pattern.blogs.behavioural.command;

import pattern.blogs.behavioural.command.lib.Monitor;
import pattern.blogs.behavioural.command.lib.ServiceCommand;

public class Driver {

    /*
    * It is similar to callback concept.
    *
    * Business flow is as follows :
    * 1. On performance monitor dashboard, we select a component and the command to execute.
    * 2. We just click on the common CTA (say monitor).
    * 3. Based on step 1, corresponding execution would be started.
    * Hence, on CTA click, operation pointed to by callback reference i.e. command object is executed.
    * */
    public static void main(String[] args) {

        // Receiver
        UserModule userModule = new UserModule();

        // Command interface and implementation
        ServiceCommand monitorService = new MonitorMemoryLeak(userModule);
        Monitor performanceMonitor = new Monitor(monitorService);

        // Issuer/Sender
        performanceMonitor.monitor();
    }
}
