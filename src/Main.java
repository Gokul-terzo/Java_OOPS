class Account{
    protected long balance;

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
        System.out.println("The current balance is:"+balance);
    }
    public void applyInterest(int years){
        temp_balance=balance+(balance*(interestRate/100)*years);
        System.out.println("The balance after interest is applied for the given duration is:"+temp_balance);
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
        account1.applyInterest(3);
    }
}
