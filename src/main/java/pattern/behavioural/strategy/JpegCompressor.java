package pattern.behavioural.strategy;

public class JpegCompressor implements ImageCompressor{
    @Override
    public void compress() {
        System.out.println("Compressing JPEG images");
    }
}
