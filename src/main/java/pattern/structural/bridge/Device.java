package pattern.structural.bridge;

// We need to ensure that all the features in feature hierarchy must be mentioned here.
public interface Device {
    void turnOn();
    void turnOf();
    void setChannel(int channel);
}
