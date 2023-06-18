package pattern.behavioural.mediator;

public class UiControl {
    // need to make this protected to use it in subclasses directly.
    protected ComponentMediator mediator;

    public UiControl(ComponentMediator mediator) {
        this.mediator = mediator;
    }
}
