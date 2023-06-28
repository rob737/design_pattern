package pattern.structural.decorator.assignment;

public class MainMarker implements Marker{

    private final Marker marker;

    public MainMarker(Marker marker) {
        this.marker = marker;
    }


    @Override
    public String render() {
        return marker.render() + "[Main]";
    }
}
