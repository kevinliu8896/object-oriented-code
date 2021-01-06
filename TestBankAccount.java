// ASSIGNMENT 1 TestBankAccount.java
// Kevin Liu
// 105191861
public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

        ba.deposit(2000);
        ba.deposit(1500);
        ba.deposit(20);
        ba.deposit(200);
        ba.deposit(3000);
        ba.deposit(22);
        ba.deposit(132);
        ba.deposit(500);
        ba.deposit(2154);
        ba.deposit(20);
        ba.deposit(55);

        ba.withdraw(500);
        ba.deductMonthlyCharge();
        ba.getBalance();
        ba.setFee(0.5);

        System.out.println("\n");


        ba.deposit(300);
        ba.deposit(100);
        ba.deposit(25);
        ba.deposit(210);
        ba.deposit(3000);
        ba.deposit(22);
        ba.deposit(132);
        ba.deposit(500);
        ba.deposit(2154);
        ba.deposit(20);
        ba.deposit(55);
        ba.deposit(15);
        ba.deposit(23);
        ba.deposit(100);
        ba.deposit(3000);
        ba.deposit(22);
        ba.deposit(132);
        ba.deposit(500);
        ba.deposit(2154);
        ba.deposit(20);
        ba.deposit(55);

        ba.withdraw(5000);
        ba.deductMonthlyCharge();
        ba.getBalance();
        ba.setFee(0.5);


    }
}

