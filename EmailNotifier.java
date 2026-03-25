public class EmailNotifier implements Notifier {
    @Override
    public void sendNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}