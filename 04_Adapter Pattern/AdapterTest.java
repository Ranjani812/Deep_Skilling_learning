public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("=== Payment Gateway Adapter Demo ===");

        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(50.0);

        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        stripe.processPayment(4150.0);
    }
}
