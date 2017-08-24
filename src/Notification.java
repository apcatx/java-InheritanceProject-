import java.time.LocalDateTime;

public abstract class Notification {

  private LocalDateTime createdAt;
  private String subject;
  private String body;
  protected String status;


  public Notification(String subject, String body) {
    createdAt = LocalDateTime.now();
    this.subject = subject;
    this.body = body;
    this.status = "Normal";
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public String getSubject() {
    return subject;
  }

  public String getBody() {
    return body;
  }

  public abstract void transport();

  public void showStatus() {
    System.out.println("Status: " + status);
  }

  protected void showText() {
    System.out.println("This is some example text.");
  }
}
