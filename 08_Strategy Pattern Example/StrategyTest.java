public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy card = new CreditCardPayment("1234567890123456");
        PaymentStrategy paypal = new PayPalPayment("user@example.com");

        System.out.println("🔁 Paying with Credit Card:");
        context.setPaymentStrategy(card);
        context.makePayment(1500.00);

        System.out.println("\n🔁 Paying with PayPal:");
        context.setPaymentStrategy(paypal);
        context.makePayment(2999.50);
    }
}
