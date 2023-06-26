package pattern.structural.adapter.assignment;

import pattern.structural.adapter.assignment.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider{
    private final GmailClient gmailClient;

    public GmailAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
