package pattern.behavioural.strategy;

public class Driver {
    public static void main(String[] args) {
        if("JPEG".equals(Compressor.valueOf("JPEG").toString()))
            new ImageStore(new PngCompressor(),new BWFilter()).store("Strategy pattern.");
    }
}
