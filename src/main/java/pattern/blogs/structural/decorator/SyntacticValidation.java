package pattern.blogs.structural.decorator;

public class SyntacticValidation implements Validation{

    private final Validation validation;

    public SyntacticValidation(Validation validation) {
        this.validation = validation;
    }

    @Override
    public String validate(String input) {
        System.out.println("Input is as per approved format.");
        return validation.validate(input);
    }
}
