public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println("Text notification recipient: " + recipient + " smtpProvider: " + smsProvider + " subject: " + getSubject() + " body: " + getBody() + " createdAt: " + getCreatedAt());
    }
}
