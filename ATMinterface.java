package CODSOFT;
import java.util.*;
 class BankAccount{
    private double balance;
    public BankAccount(double initialbalance){
        this.balance=initialbalance;
        
    } public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
        balance=balance+amount;
        System.out.println("Deposited amount :"+amount);
    System.out.println("Current Balance:"+balance);}
        else{
            System.out.println("Invalid Entry");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawn amount :"+amount);System.out.println("Current Balance:"+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

}
 class ATM{
    private BankAccount bankAccount;
    public ATM(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    } 
    public void displaypage(){
        System.out.println("ATM Server:");
        System.out.println("1.Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");
        
    }
    public void Transactionprocess(int choice,Scanner sc){
        switch(choice){
            case 1:
            System.out.println("Balance:" +bankAccount.getBalance());
            break;

            case 2:
            System.out.println("Enter Withdraw amount:");
            double Withdrawalamount=sc.nextDouble();
            bankAccount.withdraw(Withdrawalamount);
            break;
            case 3:
            System.out.println("Enter deposit amount:");
            double depositamount=sc.nextDouble();
            bankAccount.deposit(depositamount);
            break;

            case 4:
            System.out.println("Transaction completed");
            System.exit(0);
            break;

            default:
            System.out.println("Inavlid entry");

        }
    }
}
public class ATMinterface {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter initial Balance:");
    double initialbalance=sc.nextDouble();
    BankAccount bankAccount=new BankAccount(initialbalance);
    ATM atm=new ATM(bankAccount);
    while(true){
        atm.displaypage();
        System.out.println("Select an option:");
        int choice=sc.nextInt();
        atm.Transactionprocess(choice,sc);

        
    }

  }
    
}