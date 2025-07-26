public class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());

        System.out.println("=== Payment Gateway Adapter ===");
        paypal.processPayment(50);   // $50
        stripe.processPayment(50);   // ₹4150
    }
}
