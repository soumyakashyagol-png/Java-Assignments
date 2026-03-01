
    // there are twoswitches Sand s2 ,if both areturned on then none of themis
    // working ,ifone is turned onand anotherone is off thenlight is glowing and
    // fanis working ,if one is turned off and another one is on then lightis
    // glowing and motoer is working,if both arein turned off condition none of them
    // will work ,askuser to enter theinput ,like stae of S and state of S2 and give
    // output accordingly ,use exor operation as logic
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter state of S1 (true/false): ");
        boolean s1 = sc.nextBoolean();

        System.out.println("Enter state of S2 (true/false): ");
        boolean s2 = sc.nextBoolean();

        if (s1 ^ s2) {
            System.out.println("Light is glowing and Fan/Motor is working.");
        } else {
            System.out.println("Nothing is working.");
        }

        sc.close();
    }
}
