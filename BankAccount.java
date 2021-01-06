// ASSIGNMENT 1 BankAccount.java
// Kevin Liu
// 105191861

public class BankAccount { // create class called BankAccount
    private double balance; // double variable called balance to keep track of users balance
    private double fee; // double variable to calculate the fee after 10 free transactions
    private int freeTransactions; // int variable to keep track of the 10 transactions
    private int total; // int variable called total to keep track of the total amount of transactions

    public BankAccount(){ // create constructor for BankAccount
        balance = 0; // set value balance to 0
        freeTransactions = 10; // set value of freeTransactions to 10
        fee = 0.5; // set fee to 0.5
    }

    // create constructor for BankAccount to initialize the values inside and take in initialBalance as the parameter
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
        freeTransactions = 10;
        fee = 0.5;
    }

    public void deposit(double amount){ // deposits amount of money into users balance
        balance = balance + amount; // this calculates the balance with the amount that the user has deposits
        System.out.println("You have deposited: "+amount+" $");
        total++; // increment total transactions by 1
    }

    public void withdraw(double amount){ // withdraws from balance
        balance = balance - amount; // this calculates the balance by subtracting how much the amount that the user has requested to withdraw
        System.out.println("You have withdrawn: "+amount+" $"); // display how much user has withdrawn
        total++; // increment total transactions by 1
    }

    public void deductMonthlyCharge(){ // calculates the amount that must be charged monthly
        if (total > freeTransactions){ // if total transactions is more than freeTransactions (10)
            double temp = fee * (total - freeTransactions); // a temp variable of double value will be created
            balance-=temp; // balance will keep subtracting the temp variable
            System.out.println("You have been charged $" + temp); // will display the value of the fee which is the temp variable
        }
        total = 0; // reset total transactions
    }

    public double getBalance(){
        System.out.println("Your balance is: $" +balance);
        return balance;
    } // getter to return value of balance

    public void setFee(double fee) { this.fee = fee; } // create a setter for fee
} // end of BankAccount class