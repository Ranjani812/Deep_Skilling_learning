public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // Send notification using wrapped notifier first
        sendSlack(message);   // Add Slack notification
    }

    private void sendSlack(String message) {
        System.out.println("Slack notification sent: " + message);
    }
}
