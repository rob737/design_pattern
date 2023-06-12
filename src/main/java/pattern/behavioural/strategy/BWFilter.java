package pattern.behavioural.strategy;

public class BWFilter implements ImageFilter{
    @Override
    public void filter() {
        System.out.println("Filtering using BW filters.");
    }
}
