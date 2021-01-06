public class BaseFormatter implements NumberFormatter{
    private int base;

    public BaseFormatter(int base) { // constructor to take in base for formatting
    this.base = base;
    }

    @Override
    public String format(int n) {
        if(base >= 2 && base <=16) { // check if base is between 2 and 16 else return an error
            return Integer.toString(Integer.parseInt(Integer.toString(n),10),base);
        }
        return null;
    }
}
