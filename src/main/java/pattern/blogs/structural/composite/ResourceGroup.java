package pattern.blogs.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ResourceGroup implements Resource{
    private final List<Resource> resources = new ArrayList<>();

    public void addResourceToGroup(Resource resource){
        resources.add(resource);
    }

    @Override
    public void assignRole(Role role) {
        for(Resource resource : resources)
            resource.assignRole(role);
    }

}
