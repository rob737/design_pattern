package pattern.behavioural.command.assignment;

public class VideoEditor {
    private float contrast = 0.5f;
    private String text;
    private final Command command;
    private final History history;

    public VideoEditor(Command command, History history) {
        this.command = command;
        this.history = history;
    }

    public float getContrast() {
        return Float.parseFloat(this.history.peek());
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
        command.execute(String.valueOf(contrast));
    }

    public void removeText() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
        command.execute(String.valueOf(text));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VideoEditor{");
        sb.append("contrast=").append(contrast);
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
