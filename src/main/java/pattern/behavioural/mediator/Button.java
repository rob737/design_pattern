package pattern.behavioural.mediator;

public class Button extends UiControl{
    private boolean isEnabled;

    public Button(ComponentMediator mediator) {
        super(mediator);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        mediator.convey(this);
    }
}
