import java.util.ArrayList;

/**
 * Invoice class and initializing variable
 */
public class Invoice {
    private Address address;
    private ArrayList<Product> items = new ArrayList<>();
    private ArrayList<LineItem> line = new ArrayList<>();

    /**
     * @param address
     * @param lineItems
     * constructor
     */
    public Invoice(Address address, ArrayList<LineItem> lineItems) {
        this.address = address;
    }

    /**
     * @return total price of the invoice
     */
    public double calcInvoice() {
        double totalPrice = 0;
        for(int i = 0; i < line.size(); i++) {
            totalPrice += line.get(i).getTotalPrice();
        }
        return totalPrice;
    }

    /**
     * @return value of s which is to format the entire invoice stored in String s
     */
    public String formatInvoice() {
        String s;
        s = "INVOICE\n----------------------------------------------------------\n";
        s += address.formatAddress();
        s += "\n";
        for(LineItem lineItem : line) {
            s += lineItem.formatLineItem();
            s += "\n";
        }
        s += "\n----------------------------------------------------------\nTotal Cost of Everything: " + Double.toString(calcInvoice());
        return s;
    }

    /**
     * @param q, p
     * add lineItem if not out of stock
     */
    public void addLineItem(int q, Product p) {
        LineItem lineItem = new LineItem(q,p);
            if(!lineItem.outOfStock()) {
                line.add(lineItem);
            }

    }

    /**
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address
     * setter for address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return items
     */
    public ArrayList<Product> getItems() {
        return items;
    }

    /**
     * @param items
     * setter for items
     */
    public void setItems(ArrayList<Product> items) {
        this.items = items;
    }


}
