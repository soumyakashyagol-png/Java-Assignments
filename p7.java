import java.util.Scanner;
public class p7 {
//banking management system
//Whwn user put negative amount
//balance is insufficient
//always final message
    public static void main(String[] args) {
        double balance = 1000.0; // Initial balance
        double withdrawalAmount = 500.0; // Example withdrawal amount (negative)

        if (withdrawalAmount < 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (withdrawalAmount > balance) {
            System.out.println("Insufficient balance. Your current balance is: " + balance);
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        }

        System.out.println("Thank you for using our banking system.");
    }
}
