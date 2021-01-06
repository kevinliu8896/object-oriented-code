import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FormatTester {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("Numbers.txt");
            Scanner in = new Scanner(file);
            ArrayList<Integer> num = new ArrayList<>();
            while (in.hasNextLine()) {
                num.add(in.nextInt());
            }
            DefaultFormatter defaultFormatter = new DefaultFormatter();
            DecimalSeparatorFormatter decimalSeparatorFormatter = new DecimalSeparatorFormatter();
            AccountingFormatter accountingFormatter = new AccountingFormatter();
            BaseFormatter baseFormatter8 = new BaseFormatter(8); // base 8
            BaseFormatter baseFormatter2 = new BaseFormatter(2); // base 2

            FileWriter out = new FileWriter("FormattedNumbers.txt");

            out.write("Default Format: ");
            for(Integer i : num) {
                out.write(defaultFormatter.format(i) + " ");
            }
            out.write("\n");

            out.write("Decimal Format: ");
            for(Integer d : num) {
                out.write(decimalSeparatorFormatter.format(d)+ " ");
            }
            out.write("\n");

            out.write("Accounting Formatter: ");
            for(Integer af : num) {
                out.write(accountingFormatter.format(af) + " ");
            }
            out.write("\n");

            out.write("Base 8 Format: ");
            for(Integer bEight : num) {
                out.write(baseFormatter8.format(bEight) + " ");
            }
            out.write("\n");

            out.write("Base 2 Format: ");
            for(Integer bTwo: num) {
                out.write(baseFormatter2.format(bTwo)+ " ");
            }
            out.write("\n");
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not write to file");
            e.printStackTrace();
        }
    }
}
