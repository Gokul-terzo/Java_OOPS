package ATMapplication;

public class SavingsAccount extends Account{
    int transactionLimit=50000;
    public SavingsAccount(){
        super();
    }
    public void depositAmount(long amount){
       long balance=getBalance();
       balance+=amount;
       setBalance(balance);
    }
    public void withdrawAmount(long amount){
        long balance = getBalance();
        if(amount>balance){
            System.out.println("Insufficient balance!!!");
        }
        else if(amount>transactionLimit){
            System.out.println("Daily limit reached. Not possible to debit from savings account");
        }
        else {

            setBalance(balance - amount);
        }
    }
}
