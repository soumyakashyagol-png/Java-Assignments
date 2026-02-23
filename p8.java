public class p8 {
   //Even Thread and odd Thread
   //Even Thread will print even numbers from 0 to 10
   //Odd Thread will print odd numbers from 1 to 10
   //Both threads will run concurrently and print their respective numbers
    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println("Even: " + i);
            }
        });

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd: " + i);
            }
        });

        evenThread.start();
        oddThread.start();
    } 
}