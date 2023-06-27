package pattern.structural.decorator;

public class CompressedData extends CloudStream{
    @Override
    public void write(String data) {
        String compressedData = compress(data);
        super.write(compressedData);
    }

    private String compress(String data) {
        return data.substring(0,3);
    }
}
