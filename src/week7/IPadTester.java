package week7;

public class IPadTester {
    public static void main(String[] args) {
        IPadInterface ipad1 = new IPad("ipad", 64, "Cellular");
        System.out.println(ipad1);

        IPadInterface ipad2 = new IPadPro("ipadPro", 64, "Cellular");
        System.out.println(ipad2);

        IPadInterface ipad3 = new IPadBigPro("ipadProBig", 64, "cellular");
        System.out.println(ipad3);

        Product ipadProduct = new Product (new IPad("Ipad", 128, "Cellular"));
        System.out.println(ipadProduct);
    }
}
