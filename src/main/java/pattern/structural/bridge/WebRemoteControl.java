package pattern.structural.bridge;

public class WebRemoteControl extends RemoteControl{
    public WebRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number){
        device.setChannel(4);
    }
}
