package pattern.creational.prototype.assignment;

public class Audio implements Component {
    @Override
    public Component duplicate() {
        return new Audio();
    }
}
