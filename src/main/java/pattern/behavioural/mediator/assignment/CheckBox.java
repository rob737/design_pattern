package pattern.behavioural.mediator.assignment;

public class CheckBox extends UiControl{
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyHandlers();
    }
}
