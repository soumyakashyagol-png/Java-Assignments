import java.util.Scanner;
public class Chesss {
Public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows");
int r=sc.nextInt();
System.out.println("Enter the number of columns");
int c=sc.nextInt();
{
for (i=1;i<=Integer.parseInt(r);i++){
for(j=1;j<=c;j++){
if((i+j)%2==0){
System.out.print(s:"W");
}
else{
System.out.print(s:"B");
}
}
System.out.println();
}
}
}





