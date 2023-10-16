package pattern.blogs.behavioural.template.core;

public abstract class Controller {
    private final AuthenticateRequest authenticateRequest;

    public Controller(){
        this.authenticateRequest = new AuthenticateRequest();
    }

    public Controller(AuthenticateRequest authenticateRequest) {
        this.authenticateRequest = authenticateRequest;
    }

    public void execute(){
        authenticateRequest.authenticate();
        doExecute();
    }

    protected abstract void doExecute();
}
