package pattern.structural.adapter.assignment;

public class SmtpEmail implements EmailProvider{
    @Override
    public void downloadEmails() {
        System.out.println("Downloading email from SMTP server");
    }
}
