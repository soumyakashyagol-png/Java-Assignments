import java.util.Scanner;
public class ReadFiveValues {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int[] numbers=new int[5];
System.out.println("Enter 5 values:");
for(int i=0;i<5;i++) {
numbers[i]=sc.nextInt();
}
System.out.println("You entered:");
for (int i=0;i<5;i++) {
System.out.println(numbers[i]);
}
sc.close();
}
}

