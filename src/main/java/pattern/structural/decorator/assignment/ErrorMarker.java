package pattern.structural.decorator.assignment;

public class ErrorMarker implements Marker{

    private final Marker marker;

    public ErrorMarker(Marker marker) {
        this.marker = marker;
    }

    @Override
    public String render() {
        return marker.render() + "[Error]";
    }
}
