package pattern.structural.bridge;

public class Driver {
    public static void main(String[] args) {
        Device samsungTv = new SamsungTv();
        Device miTv = new MiTv();
        // instance of Device interface is acting as a bridge between remote control (feature)
        // and TV vendors (implementations).
        WebRemoteControl remoteControl = new WebRemoteControl(miTv);
        remoteControl.turnOn();
        remoteControl.setChannel(4);
        remoteControl.turnOff();
    }
}
