package pattern.behavioural.chainOfResponsibility;

import java.util.concurrent.Executors;

public class NaiveCompressor extends Handler implements Compressor {

    public NaiveCompressor(Handler next) {
        super(next);
    }

    @Override
    public boolean compress(HttpRequest request) {
        System.out.println("request is compressed.");
        return false;
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        return compress(request);
    }
}
