public class Main {
    public static void main(String[] args){
        PersonalAccount user1 = new PersonalAccount(123456, "user1");

        //Checking functions
        user1.deposit(-10000);
        user1.deposit(10000);
        user1.withdraw(-9999);
        user1.withdraw(9999);
        user1.withdraw(1223);
        user1.printTransactionHistory();
        System.out.println("balance: " + user1.getBalance());
        System.out.println("account number :" + user1.getAccountNumber());
        System.out.println("account name: " + user1.getAccountHolder());
        System.out.println(user1);

    }
}
