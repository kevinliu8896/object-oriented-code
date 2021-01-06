import java.util.Scanner;

public class ComboLockTester {
    public static void main(String[] args) {
        int n, n2, n3;
        Scanner in = new Scanner(System.in);
        ComboLock comboLock = new ComboLock(1,39,1);
        System.out.println("This is a lock try entering combinations(ENTER 3 0's TO EXIT)");
        while (true) {
            comboLock.reset();
            System.out.println("Enter amount of ticks to the right: ");
            n = in.nextInt();
            comboLock.turnRight(n);
            System.out.println("Enter amount of ticks to the left: ");
            n2 = in.nextInt();
            comboLock.turnLeft(n2);
            System.out.println("Enter amount of ticks to the right");
            n3 = in.nextInt();
            comboLock.turnRight(n3);
            if (comboLock.open()) {
                System.out.println("LOCK HAS BEEN UNLOCKED.");
                break;
            } else if (n == 0 && n2 == 0 && n3 == 0) {
                System.out.println("You have exited.");
                break;
            }
            else {
                System.out.println("The combo is incorrect.");
            }

        }
    }
}
