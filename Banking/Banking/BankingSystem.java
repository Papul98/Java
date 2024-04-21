import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();
        
        System.out.print("Enter Balance: ");
        double balance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
        
        while (true) {
            System.out.println("\nEnter 1 to Deposit");
            System.out.println("Enter 2 to Withdraw");
            System.out.println("Enter 3 to Display Account Information");
            System.out.println("Enter 4 to Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                    
                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                    
                case 3:
                    account.display();
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
