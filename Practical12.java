// For Loop in java with example
// Print first the sum of first 10 natural numbers using for loop

public class Practical12 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}

/*
OUTPUT:
Sum of first 10 natural numbers: 55
*/