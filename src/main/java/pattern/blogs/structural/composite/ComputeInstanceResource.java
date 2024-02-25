package pattern.blogs.structural.composite;

public class ComputeInstanceResource implements Resource{
    @Override
    public void assignRole(Role role) {
        System.out.println("Role : " + role + " assigned to Compute Instance Resource");
    }
}
