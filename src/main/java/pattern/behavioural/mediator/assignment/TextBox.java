package pattern.behavioural.mediator.assignment;

public class TextBox extends UiControl{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyHandlers();
    }
}
