class stringDemo {
public static void main(String args[]) {
String s1="Hello";
String s2="world";
String s3="HELLO";
System.out.println(s1.concat(s2));
System.out.println(s2.length());
System.out.println(s3.charAt(0));
System.out.println(s1.substring(2,4));
String s4=s1.replace('H','m');
System.out.println(s4);
System.out.println(s3.toLowerCase());
System.out.println(s2.toUpperCase());
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s3));
StringBuffer str=new StringBuffer("object language");
int pos=str.indexOf("language");
str.insert(pos,"orinted");
System.out.println(str);
str.setCharAt(6,'_');
System.out.println(str);
str.append("improves security");
System.out.println(str);
str.setLength(10);
System.out.println(str);
StringBuilder str1=new StringBuilder("Program");
str1.reverse();
System.out.println(str1);
System.out.println(s1.indexOf('1'));
System.out.println(s1.lastIndexOf('1'));
System.out.println(str);



}
}
