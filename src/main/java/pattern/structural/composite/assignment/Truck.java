package pattern.structural.composite.assignment;

public class Truck implements IncidentResource{
  @Override
  public void deploy() {
    System.out.println("Deploying a truck");
  }
}
