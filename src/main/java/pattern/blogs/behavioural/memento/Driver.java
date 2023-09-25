package pattern.blogs.behavioural.memento;

public class Driver {
    public static void main(String[] args) {
        CheckIn checkIn = new CheckIn();

        Commit firstCommit = new Commit(1,"Initial Code Setup");
        Commit secondCommit = new Commit(2, "Implemented JWT Authentication");
        Commit thirdCommit = new Commit(3, "Implemented User Registration flow.");

        checkIn.commitRecord(firstCommit);
        checkIn.commitRecord(secondCommit);
        checkIn.commitRecord(thirdCommit);

        System.out.println("Load latest commit...");
        System.out.println(checkIn.loadLatestSnapshot());

        System.out.println("Reverting last commit ...");
        checkIn.revert();

        System.out.println("Load latest commit...");
        System.out.println(checkIn.loadLatestSnapshot());
    }
}
