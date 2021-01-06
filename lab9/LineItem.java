/**
 * LineItem class
 */
public class LineItem {
    private int quantity;
    private Product item;

    /**
     * @param quantity
     * @param item
     */
    public LineItem(int quantity, Product item) {
        this.quantity = quantity;
        this.item = item;
    }

    /**
     * @return total
     */
    public double getTotalPrice() {
        double total = 0;
        total = item.getPrice() * quantity;
        return total;
    }

    /**
     * @return stock if true or false
     */
    public boolean outOfStock() {
        boolean stock = false;
        if(quantity > item.getStock()) {
            quantity = 0;
            stock = true;
        }
        return stock;
    }

    /**
     * @return string formatting
     */
    public String formatLineItem() {
            return "Product: " + item.getDescription() + " Price: " + item.getPrice() + " Quantity: " + quantity + " Total Cost: " + getTotalPrice();
    }
}
