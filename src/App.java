import service.StudentService;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View DSA Students");
            System.out.println("3. Add Skill");
            System.out.println("4. Add Practice");
            System.out.println("5. Show Analytics");
            System.out.println("6. Delete Inactive");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: service.addStudent(); break;
                case 2: service.getDSAStudents(); break;
                case 3: service.addSkill(); break;
                case 4: service.addPractice(); break;
                case 5: service.showAnalytics(); break;
                case 6: service.deleteInactive(); break;
                case 7: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }
}