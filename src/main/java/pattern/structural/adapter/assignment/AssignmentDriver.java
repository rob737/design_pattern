package pattern.structural.adapter.assignment;

import pattern.structural.adapter.assignment.Gmail.GmailClient;

public class AssignmentDriver {
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();
        //emailClient.addProvider(new SmtpEmail());
        emailClient.addProvider(new GmailAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }
}
