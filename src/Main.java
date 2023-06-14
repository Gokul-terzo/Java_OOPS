class Account{
    private long balance;

    public Account(long balance){
        this.balance=balance;
    }
    protected void credit(long credit)
    {
        balance+=credit;
    }
    protected void debit(long debit)
    {
        balance-=debit;
    }
    public void display()
    {
        System.out.println("Balance is:"+balance);
    }
}
class SavingsAccount extends Account{  //The savings account class inherits the Account class
    protected float interestRate;
    public float temp_balance;
    public SavingsAccount(long balance,float interest){
        super(balance);
        interestRate=interest;
    }
    public void showBalance()
    {
        display();
    }
}
public class Main { //here public is the access specifier for the class
    public static void main(String args[]){
        SavingsAccount account1=new SavingsAccount(10000L,5.13F);
        account1.showBalance();
        account1.credit(10000);
        account1.showBalance();
        account1.debit(3000);
        account1.showBalance();
    }
}
