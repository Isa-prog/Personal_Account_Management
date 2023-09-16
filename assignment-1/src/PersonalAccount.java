import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions = new ArrayList<>();

    PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        balance = 0.0;
    }
    //add deposit to your balance and transaction history
    public void deposit(double amount) {
        if(amount <= 0){
            System.out.println("your deposit must be more than 0");
        }else{
            balance += amount;
            Amount temp = new Amount("deposit", amount);
            transactions.add(temp);
        }
    }
    ////add withdraw to your balance and transaction history
    public void withdraw(double amount) {
        if(amount < 0){
            System.out.println("Your withdraw must be more than 0");
        } else if (amount > balance) {
            System.out.println("Your transaction must be equal or less than your balance");
        } else {
            balance -= amount;
            Amount temp = new Amount("withdraw", amount);
            transactions.add(temp);
        }
    }
    //prints all transactions
    public void printTransactionHistory() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    //function to convert object info to String
    public String toString() {
        String s = "user: " + accountHolder + "\nbalance: " + balance;
        return s;
    }
}
