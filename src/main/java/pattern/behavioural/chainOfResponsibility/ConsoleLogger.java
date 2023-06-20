package pattern.behavioural.chainOfResponsibility;

import java.util.concurrent.Executors;

public class ConsoleLogger extends Handler implements Logger{

    public ConsoleLogger(Handler next) {
        super(next);
    }

    @Override
    public boolean log(HttpRequest request) {
        System.out.println("Logged to console.");
        return false;
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        return log(request);
    }
}
