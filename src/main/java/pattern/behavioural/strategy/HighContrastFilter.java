package pattern.behavioural.strategy;

public class HighContrastFilter implements ImageFilter{
    @Override
    public void filter() {
        System.out.println("Filtering high contrast images.");
    }
}
