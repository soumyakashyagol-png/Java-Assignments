//Write a program to: 
//Add new food stalls. 
//Serve customers in order. 
//Track last visited stalls. 
//Show daily festival history.
import java.util.LinkedList;
import java.util.Queue;
public class p6 {
    private Queue<String> foodStalls;
    private LinkedList<String> lastVisitedStalls;
    private LinkedList<String> dailyHistory;

    public p6() {
        foodStalls = new LinkedList<>();
        lastVisitedStalls = new LinkedList<>();
        dailyHistory = new LinkedList<>();
    }

    public void addFoodStall(String stallName) {
        foodStalls.add(stallName);
        System.out.println("Added food stall: " + stallName);
    }

    public void serveCustomer() {
        if (!foodStalls.isEmpty()) {
            String servedStall = foodStalls.poll();
            lastVisitedStalls.add(servedStall);
            dailyHistory.add(servedStall);
            System.out.println("Served customer at: " + servedStall);
        } else {
            System.out.println("No food stalls available to serve customers.");
        }
    }

    public void showLastVisitedStalls() {
        System.out.println("Last visited stalls: " + lastVisitedStalls);
    }

    public void showDailyHistory() {
        System.out.println("Daily festival history: " + dailyHistory);
    }

    public static void main(String[] args) {
        p6 festival = new p6();
        
        festival.addFoodStall("Taco Stand");
        festival.addFoodStall("Burger Joint");
        festival.addFoodStall("Pizza Place");

        festival.serveCustomer();
        festival.serveCustomer();

        festival.showLastVisitedStalls();
        festival.showDailyHistory();
    }
}