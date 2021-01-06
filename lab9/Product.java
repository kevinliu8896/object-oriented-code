/**
 * Product class
 */
public class Product {
    private String description;
    private double price;
    private int stock;
    private boolean isOutOfStock;

    /**
     * @param description
     * @param price
     */
    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    /**
     * @param description
     * @param price
     * @param stock
     */
    public Product(String description, double price, int stock) {
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     * setter for description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price
     * setter for price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock
     * setter for stick
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return string for formatting
     */
    @Override
    public String toString() {
        return "Product{" +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
