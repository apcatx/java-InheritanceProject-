public class Main {

  public static void main(String[] args) {

    EmailNotification emailNot = new EmailNotification("New Email Subject", "New Email Body", "New Email Recipient", "Google");

    emailNot.transport();
    emailNot.showStatus();
    emailNot.showText();

    Object emailClone = emailNot.clone();

    if (emailNot.equals(emailClone)) {
      System.out.println("It's Alive");
    } else {
      System.out.println("We failed! Curses");
    }

    TextNotification textNot = new TextNotification("New Text Subject", "New Text Body", "New Text Recipient", "Google ProjectFi");

    textNot.transport();
    textNot.showStatus();

  }
}
