package pattern.blogs.structural.composite;

public class LambdaResource implements Resource{
    @Override
    public void assignRole(Role role) {
        System.out.println("Role : " + role + " assigned to Lambda resource.");
    }
}
