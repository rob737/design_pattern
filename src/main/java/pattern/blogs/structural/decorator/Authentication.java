package pattern.blogs.structural.decorator;

public class Authentication implements Validation{
    private final Validation validation;

    public Authentication(Validation validation) {
        this.validation = validation;
    }

    @Override
    public String validate(String input) {
        System.out.println("Successfully authenticated request");
        return validation.validate(input);
    }
}
