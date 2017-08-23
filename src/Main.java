public class Main {


    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification("New Email", "New Body", "New Recipient", "Google");
        TextNotification textNotification = new TextNotification("New", "New Text", "New Recipient", "Google ProjectFi");

        emailNotification.transport();
        textNotification.transport();
    }
}
