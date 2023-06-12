package pattern.behavioural.strategy;

public class PngCompressor implements ImageCompressor{
    @Override
    public void compress() {
        System.out.println("Compressing PNG images.");
    }
}
