import java.util.Scanner;   // ALWAYS at top

public class p3 {           // Class name must match file name

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        double travelExpense, foodExpense, otherExpense, total;

        System.out.print("Enter travel expense: ");
        travelExpense = sc.nextDo uble();

        System.out.print("Enter food expense: ");
        foodExpense = sc.nextDouble();

        System.out.print("Enter other expense: ");
        otherExpense = sc.nextDouble();

        total = travelExpense + foodExpense + otherExpense;

        System.out.println("Total Expense = " + total);

        if (total < 2000) {
            System.out.println("Good, keep it up ");
        } else {
            System.out.println("Improve your expenses ");
        }

        sc.close();
    }
}
