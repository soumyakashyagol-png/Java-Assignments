public class p4 {
// Function to calculate total daily expenses
    public static double calculateTotalExpenses(double travelExpense, double foodExpense, double otherExpense) {
        return travelExpense + foodExpense + otherExpense;
    }

    public static void main(String[] args) {
        double travelExpense = 500.0; // Example travel expense
        double foodExpense = 300.0;   // Example food expense
        double otherExpense = 200.0;  // Example other expense

        double total = calculateTotalExpenses(travelExpense, foodExpense, otherExpense);

        System.out.println("Total Expense = " + total);

        if (total < 2000) {
            System.out.println("Good, keep it up ");
        } else {
            System.out.println("Improve your expenses ");
        }
    }
    
}
