import java.util.Scanner;

/**
 * This class prints prime numbers.
 */
public class PrimePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int limit = in.nextInt();
// Complete this part
        PrimeGenerator gen = new PrimeGenerator();
        int num = gen.nextPrime();
        while (num <= limit) {// inclusive for the numbers that user inputs.
            System.out.println(num);
            num = gen.nextPrime();
        }
    }
}