class TableThread extends Thread {

    // Custom Method: Calculates and prints a multiplication table
    void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try {
                Thread.sleep(400); // Small delay to see the output clearly
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    // Method 1: The run() method calls our custom method
    public void run() {
        System.out.println("Thread started... Printing Table of 5");
        printTable(5); // Calling the custom method inside the thread
    }
}
public class Practical32 {
    public static void main(String[] args) {
         TableThread t1 = new TableThread();
        t1.start();
    }
}
