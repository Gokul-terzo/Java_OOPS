package ATMapplication;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private HashMap<Long,Integer> accountDetails=new HashMap<>();
    public Main(){
        accountDetails.put(19979L,1234);
        accountDetails.put(189798L,1456)
    }

    public HashMap<Long, Integer> getAccountDetails() {
        return accountDetails;
    }
    public boolean checkAccountnumber(long accountNumber){
        if(accountDetails.containsKey(accountNumber))
            return true;
        else
            return false;
    }
    public boolean checkAccountPin(long accountNumber,int pin){
        if(accountDetails.get(accountNumber)==pin)
            return true;
        else
            return false;
    }
    public void setAccountDetails(HashMap<Long, Integer> accountDetails) {
        this.accountDetails = accountDetails;
    }

    @Override
    public String toString() {
        return "Main{" +
                "accountDetails=" + accountDetails +
                '}';
    }

    public static void main(String args[]){
        Main user1=new Main();
        Scanner sc=new Scanner(System.in);
//        HashMap<Long,Integer> map=data.getAccountDetails();
        System.out.println("Welcome to XYZ ATM.");
        System.out.print("Please enter your account number");
        long accountNumber=sc.nextLong();
        boolean accountPresent=user1.checkAccountnumber(accountNumber);
        if(accountPresent==true)
            System.out.print("\nEnter your PIN:");
        else {
            System.out.println("Account number not registered.");
            System.exit(0);
        }
        int accountPin=sc.nextInt();
        boolean t=user1.checkAccountPin(accountNumber,accountPin);
        if(t==true){
            Menu menu1=new Menu();
            menu1.displayMenu();
        }
        else{
            System.out.println("Incorrect PIN");
            System.exit(0);
        }
    }
}
