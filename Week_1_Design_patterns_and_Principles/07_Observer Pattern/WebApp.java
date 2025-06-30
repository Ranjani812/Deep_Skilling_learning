public class WebApp implements Observer {
    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("💻 WebApp: " + stockName + " updated to ₹" + newPrice);
    }
}
