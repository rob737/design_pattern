package pattern.blogs.structural.decorator;

public class Request implements Validation{

    @Override
    public String validate(String input) {
        return input + " validated .";
    }
}
