package pattern.behavioural.state.assignment;

// context
// This is following Open closed principle i.e.
// Open for Extension but closed for modification.
public class DirectionService {
    private Itinerary itinerary;

    public Object getEta(){
        return itinerary.getEta();
    }

    public Object getDirection(){
        return itinerary.getDirection();
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }
}
