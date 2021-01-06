/**
 * Address class declare instance variables
 */
public class Address {
    private String country, address, city, state, postalCode;

    /**
     * constructor
     * @param country
     * @param address
     * @param city
     * @param state
     * @param postalCode
     */
    public Address(String country, String address, String city, String state, String postalCode) {
        this.country = country;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     * setter for country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     * setter for address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     * setter for city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     * setter for state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode
     * setter for postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return format of Adress
     */
    public String formatAddress() {
        return "Address: " + country + ", " + address + ", " + city + ", " + state + ", " + postalCode + "\n";
    }
}
