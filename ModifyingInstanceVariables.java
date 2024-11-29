public class ModifyingInstanceVariables {

        // Instance variables

    private String accountHolder;
    private double balance;

    // Constructor to initialize instance variables
    public ModifyingInstanceVariables (String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposite(double amount){
        if(amount > 0){
            balance +=balance;
            System.out.println(amount+"deposited. New Balance: "+balance);}
            else{
                System.out.println("Invalid deposit amount.");
            }
    }

    // Method to withdraw money
    public void withdraw (double amount){
        if (amount>0 && amount <=balance){
            balance -= amount;
            System.out.println(amount+"withdrawn. New Balance: "+balance);}
            else{
                System.out.println("Invalid withdrawal amount or insufficient balance.");
            }
            
        }
        
        public static void main(String[] args) {
            ModifyingInstanceVariables account =new ModifyingInstanceVariables("Manish Khadka", 5050);
            account.deposite(15500);
            account.withdraw(2000);
        }
    }


