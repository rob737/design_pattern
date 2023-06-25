package pattern.structural.composite.assignment;

import java.util.ArrayList;
import java.util.List;

public class Team implements IncidentResource {
  private final List<IncidentResource> resources = new ArrayList<>();

  public void add(IncidentResource resource) {
    resources.add(resource);
  }

  @Override
  public void deploy() {
    for (IncidentResource resource : resources) {
      resource.deploy();
    }
  }
}
