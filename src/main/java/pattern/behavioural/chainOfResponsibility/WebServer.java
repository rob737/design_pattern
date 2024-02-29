package pattern.behavioural.chainOfResponsibility;

/*
* In this use case, whenever we get any request on a server.
* We need to perform couple of operations on it i.e. a pipeline is created on request object.
* The commented code works perfectly fine but let's say if we want to disable one of the operation
* in pipeline then we would need to come back to this class and modify it.
* Thus, violating Open For Extension and closed for modification principle.
* */
public class WebServer {
   /* private final Authenticator authenticator;
    private final Compressor compressor;
    private final Logger logger;

    public WebServer(Authenticator authenticator, Compressor compressor, Logger logger) {
        this.authenticator = authenticator;
        this.compressor = compressor;
        this.logger = logger;
    }

    public void handle(HttpRequest request){
        // Authenticate
        authenticator.authenticate(request);
        // compress
        compressor.compress(request);
        // log
        logger.log(request);
    }*/

    private final Handler handler;


    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        handler.handle(request);
    }

}
