public class EmailNotification extends Notification {

  private String recipient;
  private String smtpProvider;

  public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
    super(subject, body);
    this.recipient = recipient;
    this.smtpProvider = smtpProvider;
    status = "Active";
  }

  public String getRecipient() {
    return recipient;
  }

  public String getSmtpProvider() {
    return smtpProvider;
  }

  @Override
  public void transport() {
    System.out.println("Email notification recipient: " + recipient + " smtpProvider: " + smtpProvider + " subject: " + getSubject() + " body: " + getBody() + " createdAt: " + getCreatedAt());
  }

  @Override
  public void showText() {
    super.showText();
    System.out.println("This is some more text, different from the superClass text");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    EmailNotification that = (EmailNotification) o;

    if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
    return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
  }

  @Override
  public int hashCode() {
    int result = recipient != null ? recipient.hashCode() : 0;
    result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
    return result;
  }

  @Override
  protected Object clone() {
    return new EmailNotification(getSubject(), getBody(), recipient, smtpProvider);
  }
}
