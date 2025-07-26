public class ProxyTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("cat.jpg");
        Image image2 = new ProxyImage("dog.jpg");

        image1.display();
        System.out.println();

        image1.display();
        System.out.println();

        image2.display();
        System.out.println();

        image2.display();
    }
}
