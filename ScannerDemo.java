import java.io.*;
class scannerDemo
{
public static void main(String args[])throws IOException
{        
DataInputStream s=new DataInputStream(System.in);
System.out.println("enter College name");
String collegename=s.readLine();
System.out.println("enter student name");
String name=s.readLine();
System.out.println("enter rollno");
int rollno=Integer.parseInt(s.readLine());
System.out.println("enter student score");
float score=Float.parseFloat(s.readLine());
System.out.println("Enter semester");
byte sem=Byte.parseByte(s.readLine());
System.out.println("Enter gender");
char gender=(char)System.in.read();
System.out.println("Rollno="+rollno);
System.out.println("sem="+sem);
System.out.println("student name="+name);
System.out.println("college name="+collegename);
System.out.println("score="+score);
//int a="123";
System.out.println(Integer.parseInt("123"));
System.out.println(Float.parseFloat("23.45"));
System.out.println(Integer.parseInt("100",2));
System.out.println(Integer.parseInt("100",8));
System.out.println(Integer.parseInt("aa",16));
}
}