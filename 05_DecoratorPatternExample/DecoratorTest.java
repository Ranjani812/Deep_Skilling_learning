public class DecoratorTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackSmsEmailNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);
        slackSmsEmailNotifier.send("Hello! This is your notification.");
    }
}
