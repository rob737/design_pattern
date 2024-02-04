package pattern.blogs.structural.decorator;

public class Demo {
    public static void initiateRequest(){
        // This is mocking runtime where we can attach middlewares i.e. different validations on the fly.
        // Biggest advantage of leveraging decorator pattern is that we can mix match middlewares instead
        // of creating subclasses for each of the combination.

        Request request = new Request();

        //String response = new Authentication(new CorsValidation(request)).validate("Decorator pattern");
        String response = new Authentication(new SyntacticValidation(request)).validate("Decorator pattern");

        System.out.println(response);
    }
}
