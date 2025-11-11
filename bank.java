
import java.util.ArrayList;
import java.util.Scanner;
class BankAccount{
    private String accountHolderName;
    private String accountNumber;
    private double accountBalance;
    //private ArrayList<Transaction> transaction;

    //constructor
    public BankAccount(String name, String accNumber) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.accountBalance = 0.0;
       // this.transaction = new ArrayList<>();
    } 
    public String getAccountNumber(){
        return accountNumber;
    }
    //method 4 deposit
    public void deposit(double amount){
        if(amount > 0){
            accountBalance += amount;
           // transaction record
           //transaction.add(new Transaction("Deposit", amount, accountBalance));
           System.out.println("Deposite successfullyand your balanceis: "+ accountBalance);
        }
        else{
            System.out.println("ERROR, deposite amount must be greater than zero");
        }
    }
    //method 4 withdraw
    public void withdraw(double amount){
        double accuntBalance = 0;
        if(amount <= 0){
            System.out.println("ERROR, withdrawal amount must be greaterthan zero");
        }
        else if(amount > accuntBalance){
            System.out.println("You have insufficient funds");
        }
        else{
            accountBalance -= amount;
            //transaction record
            //transaction.add(new Transaction("withdrawal", amount, accountBalance));
            System.out.println("Withdrawal successful and your balance is: "+ accountBalance);
        }
    }
    //method 4 account details
    public void showAccountDetails(){
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + accountBalance);
        /*  System.out.printl("------Transaction history-----);
         if(transactions.size() == 0){
           System.out.println("No transactions yet");
         }
         else{
           for(Transaction t : transactions){
           System.out.println(t)
           }
           } */ 
        System.out.println("==================");    
         }
    }
public class bank{
    static ArrayList<String> usedAccountNumbers = new ArrayList<>();
    static ArrayList<BankAccount> accounts = new ArrayList<>();
    static final String BANK_CODE = "4003772";
    static Scanner input = new Scanner(System.in);
public static void main(String[] args){
    while (true) { 
        System.out.println("===== BANK SYSTEM MENUE =====");
        System.out.println("1. Create New Account");
        System.out.println("2. Deposite");
        System.out.println("3. Withdraw");
        System.out.println("4. Shoe Account Details");
        System.out.println("5. Exit");
        System.out.println("Choose on the options above"); 
        String option = input.nextLine(); // this reads the user's option

        switch (option) {
            case "1":
                createAccount(){
        System.out.print("Enter Account Holder Name");
        String name = input.nextLine();

        System.out.print("Enter 7 unique digits for account; ");
        String uniqueDigits = input.nextLine();

       if(uniqueDigits.length() = 7 ||);
                break;
            case "2":
               makeDeposit();
                break;
            case "3":
                makeWithdrawal();
                break;
            case "4":
                displayAccount();
                break;
            case "5":
                System.out.println("you have quited");
                return;
            default:
                System.out.println("Invalid option");
        }
    }
     static void  createAccount()
    }
    }
        
    }
