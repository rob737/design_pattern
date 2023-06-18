package pattern.behavioural.mediator;

public class TextBox extends UiControl{
    private String content;

    public TextBox(ComponentMediator mediator) {
        super(mediator);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        mediator.convey(this);
    }
}
