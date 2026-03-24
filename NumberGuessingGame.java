import java.util.*;
public class NumberGuessingGame {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String[]words={"apple","banana","orange","grapes","mango"};
Random rand=new Random();
String word=words[rand.nextInt(words.length)];
Scanner scanner=new Scanner(System.in);
char[]guessedWord=new char[word.length()];
Arrays.fill(guessedWord,'_');
int attempts=6;
while (attempts>0){
System.out.println("Word:"+String.valueOf(guessedWord));
System.out.print("Guess a letter:");
char guess=sc.next().charAt(0);
boolean found=false;
for(int i=0;i<word.length();i++) {
if (word.charAt(i)==guess){
guessedWord[i]=guess;
found=true;
}
}
if(!found) {
attempts--;
System.out.println("Wrong guess!Attempts left:"+attempts);
}
if(word.equals(String.valueOf(guessedWord))) {
System.out.println("Congratulations!you guessed the word:"+word);
break;
}
}
if(attempts==0){
System.out.println("Game Over!The word was:"+word);
}
sc.close();
}
}


  
