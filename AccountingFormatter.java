public class AccountingFormatter implements NumberFormatter {
    @Override
    public String format(int n) {
        if (n < 0) { // if n is a negative integer
            n = Math.abs(n); // we set it to an absolute value so that we can get rid of the negative sign
            return String.format("(%d)", n); // remove "-" from negative number and put it inside a pari of ()
        } else {
            return String.valueOf(n); // otherwise it will return just the value of n
        }
    }
}
