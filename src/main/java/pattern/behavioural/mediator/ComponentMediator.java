package pattern.behavioural.mediator;

/*
* Concrete implementation of this mediator class should figure out
* based on the currently selected object, what interaction logic should be leveraged.
* Basically, we are putting all interaction logic in one place.
* It's okay if we include if-else here.
* Doubt :
* What about open for extension and closed for modification principle?
* It is only the driver class that is being changed and not the actual component classes.
*
* */
public abstract class ComponentMediator {
    abstract void convey(UiControl uiControl);
    abstract void simulateUserInteraction();
}
