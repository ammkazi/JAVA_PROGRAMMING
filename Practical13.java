// do-while loop example in Java

public class Practical13 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}

/*
OUTPUT:

Sum of first 10 natural numbers: 55
*/