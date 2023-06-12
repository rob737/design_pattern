package pattern.behavioural.strategy.assignment;

public class Driver {
    /*
    * Same option (encrypt) was applied to same state/entity (Robin)
    * using multiple underlying implementation or strategies.
    *
    * If this was state pattern then for same option, we could only have
    * one underlying implementation per state/entity.
    * */

    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient();
        chatClient.send("Robin", new AESEncryption());
        chatClient.send("Robin", new DESEncryption());
    }
}
