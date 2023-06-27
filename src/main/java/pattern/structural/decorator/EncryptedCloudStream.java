package pattern.structural.decorator;

public class EncryptedCloudStream implements CloudStreamPlaceholder {
    private final CloudStreamPlaceholder cloudStream;

    public EncryptedCloudStream(CloudStreamPlaceholder cloudStream) {
        this.cloudStream = cloudStream;
    }

    @Override
    public void write(String data) {

        String encryptedData = encrypt(data);
        // This is getting decorated with encrypted data.
        cloudStream.write(encryptedData);
    }

    private String encrypt(String data) {
        return "#$@%@#$%*@($%";
    }
}
