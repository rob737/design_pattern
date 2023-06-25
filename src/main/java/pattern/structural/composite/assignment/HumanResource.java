package pattern.structural.composite.assignment;

public class HumanResource implements IncidentResource{
  @Override
  public void deploy() {
    System.out.println("Deploying a human resource");
  }
}
