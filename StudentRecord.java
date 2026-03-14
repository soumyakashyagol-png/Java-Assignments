import java.util.Scanner;
class Student {
int rollNo;
String name;
double marks;
void readData(Scanner sc) {
System.out.println("Enter Roll No:");
rollNo=sc.nextInt();
sc.nextLine();
System.out.print("Enter Name:");
name=sc.nextLine();
System.out.println("Enter Marks:");
marks=sc.nextDouble();
}
void displayData() {
System.out.println("Roll No:"+rollNo);
System.out.println("Name:"+name);
System.out.println("Marks:"+marks);
}
}
public class StudentRecord {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Student[] s = new Student[5];
for(int i=0;i<5;i++) {
s[i]=new Student();
System.out.println("Enter details for Student"+(i+1));
s[i].readData(sc);
}
System.out.println("\nStudent Records:");
for(int i=0;i<5;i++) {
s[i].displayData();
}
sc.close();
}
}
