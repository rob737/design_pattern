package pattern.structural.decorator;

public class CompressedData implements CloudStreamPlaceholder{
    private final CloudStreamPlaceholder cloudStream;

    public CompressedData(CloudStreamPlaceholder cloudStream) {
        this.cloudStream = cloudStream;
    }

    @Override
    public void write(String data) {
        String compressedData = compress(data);
        cloudStream.write(compressedData);
    }

    private String compress(String data) {
        return data.substring(0,3);
    }
}
