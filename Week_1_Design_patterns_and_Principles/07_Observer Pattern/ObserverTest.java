public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stock = new StockMarket("TCS", 3500.00);

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stock.registerObserver(mobile);
        stock.registerObserver(web);

        stock.setPrice(3600.00);
        stock.setPrice(3700.50);

        stock.removeObserver(web);
        stock.setPrice(3650.00);
    }
}
