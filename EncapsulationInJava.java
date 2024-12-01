
// Account class with encapsulation for password only

class Account {
    public String username; 
    protected String gmail; 
    private String password; 

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}

public class EncapsulationInJava {
    public static void main(String[] args) {
        Account account = new Account();

        // Accessing public field directly
        account.username = "John Doe";

        // Accessing protected field directly (within the same package)
        account.gmail = "johndoe@example.com";

        // Setting and getting private field using methods
        account.setPassword("password123");

        // Output
        System.out.println("Username: " + account.username); // Public field
        System.out.println("Gmail: " + account.gmail);       // Protected field
        System.out.println("Password: " + account.getPassword()); // Private field through getter
    }
}
