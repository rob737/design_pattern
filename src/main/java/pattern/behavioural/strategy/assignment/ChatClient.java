package pattern.behavioural.strategy.assignment;

public class ChatClient {
    private Encryption encryptionAlgorithm;

    /*public ChatClient(Encryption encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }*/

    /*public void send(String message) {
        if (encryptionAlgorithm == "DES")
            System.out.println("Encrypting message using DES");
        else if (encryptionAlgorithm == "AES")
            System.out.println("Encrypting message using AES");
        else
            throw new UnsupportedOperationException("Unsupported encryption algorithm");

        System.out.println("Sending the encrypted message...");
    }*/

    public void send(String message, Encryption encryptionAlgorithm){
        encryptionAlgorithm.encrypt(message);
    }
}
