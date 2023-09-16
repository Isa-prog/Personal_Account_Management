public class Amount {
    private double amount;
    private String transactionType;
    Amount(String transactionType, double amount){
        this.transactionType = transactionType;
        this.amount = amount;
    }
    //function to convert object info to String
    public String toString(){
        String s = "transaction: " + transactionType + "\namount: " + amount;
        return s;
    }
}
