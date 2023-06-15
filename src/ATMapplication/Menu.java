package ATMapplication;

import java.text.NumberFormat;
import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        Account account;
        System.out.println("Choose account type:(1.Savings,2.Current)");
        choice = sc.nextInt();
        if (choice == 1) {
            account = new SavingsAccount();
            while (true) {
                System.out.println("Enter your choice");
                System.out.println("1.Check account balance");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Cancel transaction");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        long bal = account.getBalance();
                        System.out.println("The current balance is:" + NumberFormat.getCurrencyInstance().format(bal));
                        break;
                    case 2:
                        long balance = account.getBalance();
                        System.out.println("Enter the amount:");
                        long amount = sc.nextLong();
                        account.setBalance(balance + amount);
                        break;
                    case 3:
                        long balanceAcc = account.getBalance();
                        System.out.println("Enter the amount:");
                        long amount1 = sc.nextLong();
                        account.setBalance(balanceAcc - amount1);
                        break;
                    case 4:System.exit(0);
                    break;
                    default:
                        break;
                }
            }
        } else {
            account = new CurrentAccount();
            while (true) {
                System.out.println("Enter your choice");
                System.out.println("1.Check account balance");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Cancel transaction");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        long bal = account.getBalance();
                        System.out.println("The current balance is:" + NumberFormat.getCurrencyInstance().format(bal));
                        break;
                    case 2:
                        long balance = account.getBalance();
                        System.out.println("Enter the amount:");
                        long amount = sc.nextLong();
                        account.setBalance(balance + amount);
                        break;
                    case 3:
                        long balanceAcc = account.getBalance();
                        System.out.println("Enter the amount:");
                        long amount1 = sc.nextLong();
                        account.setBalance(balanceAcc - amount1);
                        break;
                    case 4:System.exit(0);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
