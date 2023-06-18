package pattern.behavioural.mediator;

public class Driver {
    public static void main(String[] args) {
        ComponentMediator componentMediator = new MediatorImpl();
        componentMediator.simulateUserInteraction();
    }
}
