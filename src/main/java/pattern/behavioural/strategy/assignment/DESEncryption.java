package pattern.behavioural.strategy.assignment;

public class DESEncryption implements Encryption{
    @Override
    public void encrypt(String input) {
        System.out.println("Encrypted file : " + input + " via DES");
    }
}
