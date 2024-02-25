package pattern.blogs.structural.composite;

public class Demo {

    static void mockRoleAssignment(){

        // Read only role to be assigned to whole group.
        ResourceGroup readOnlyResource = new ResourceGroup();

        readOnlyResource.addResourceToGroup(new LambdaResource());
        readOnlyResource.addResourceToGroup(new ComputeInstanceResource());
        readOnlyResource.addResourceToGroup(new LogResource());

        readOnlyResource.assignRole(Role.READ_ONLY);

        // Both read and write role to be assigned to individual resource.
        Resource resource = new ComputeInstanceResource();
        resource.assignRole(Role.READ_WRITE);
    }
}
