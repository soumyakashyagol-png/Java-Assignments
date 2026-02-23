//write a program to check/ask user to  enter the there 7 days attendence if they present enter 1 else 0,and also if there attedence is less then 3 then print he is not allowed to exmm and also if there attendence is more than 4 then they wouldd be alloweed to exam
import java.util.Scanner;
public class Attendence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int att=0;
        for(int i=1;i<=7;i++){
            System.out.println("Enter 1 if you are present else enter 0");
            int a = sc.nextInt();
            if(a==1){
                att++;
            }
        }
        if(att<4){
            System.out.println("You are not allowed to exam");
        }
        else {
            System.out.println("You are allowed to exam");
        }
        
        
        
    }
    
}