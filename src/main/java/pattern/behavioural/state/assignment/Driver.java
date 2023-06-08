package pattern.behavioural.state.assignment;

public class Driver {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService();
        directionService.setItinerary(new Driving());
        directionService.getEta();
        directionService.getDirection();
    }
}
