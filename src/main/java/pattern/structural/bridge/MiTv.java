package pattern.structural.bridge;

public class MiTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("MiTV : turn on");
    }

    @Override
    public void turnOf() {
        System.out.println("MiTV : turn off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("MiTv : set channel");
    }
}
