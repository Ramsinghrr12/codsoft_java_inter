import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

class Bank{
    private double balance;

    public Bank(double initialBalace){
        this.balance=initialBalace;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        

        System.out.println("Successfully deposited: ₹" + amount);
        }
    else {
        System.out.println("Invalid deposit amount!");
    }
}

public boolean withdraw(double amount){
    if(amount>0 && amount<=balance){
        balance-=amount;
        System.out.println("Successfully withdrew: ₹" + amount);
            return true;
    }
    else if (amount > balance) {
        System.out.println("Insufficient balance for this transaction!");
        return false;
    } else {
        System.out.println("Invalid withdrawal amount!");
        return false;
    }
}
public double checkbalance(){
    return balance;
}

}

public class  ATM {
    private Bank bankaccount;


    public ATM(Bank bankaccount){
        this.bankaccount=bankaccount;

    }
    public void start(){
        Scanner scanner=new Scanner(System.in);
        int choice;
        do{


     System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: ₹" + bankaccount.checkbalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    bankaccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawalAmount = scanner.nextDouble();
                    bankaccount.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
    public static void main(String[] args) {
        Bank useraccount=new Bank(10000.0);
        ATM atm=new ATM(useraccount);
        atm.start();
    }

}