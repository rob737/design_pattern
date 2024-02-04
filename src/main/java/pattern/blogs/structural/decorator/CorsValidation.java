package pattern.blogs.structural.decorator;

public class CorsValidation implements Validation {
    private final Validation validation;

    public CorsValidation(Validation validation) {
        this.validation = validation;
    }

    @Override
    public String validate(String input) {
        System.out.println("CORS is enabled for referer of this request.");
        return validation.validate(input);
    }
}
