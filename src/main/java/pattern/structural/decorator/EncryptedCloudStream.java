package pattern.structural.decorator;

public class EncryptedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        String encryptedData = encrypt(data);
        super.write(encryptedData);
    }

    private String encrypt(String data) {
        return "#$@%@#$%*@($%";
    }
}
