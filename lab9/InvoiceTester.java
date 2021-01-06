import java.util.ArrayList;

/**
 * Create class invoice tester
 */
public class InvoiceTester {
    /**
     * @param args main method to test
     */
    public static void main(String[] args) {
        Address a = new Address("Canada", "1690 Lansdowne Ave", "LaSalle", "ON", "N9J3X8");
        Invoice i = new Invoice(a, new ArrayList<LineItem>());

        i.addLineItem(6, new Product("Banana", 4.25, 10));
        i.addLineItem(3, new Product("Potatoes", 4.25, 4));
        i.addLineItem(5, new Product("Pizza", 12.75, 5));
        i.addLineItem(1, new Product("Coconut", 3.75, 0));


        System.out.println(i.formatInvoice());
    }
}
