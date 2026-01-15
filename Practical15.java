// Array in java - Single Dimensional Array
// Accept five elements from user and store them in an array 
// and print the sum of all elements

import java.util.Scanner;
public class Practical15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int i;
        int sum = 0;
        System.out.println("Enter five numbers:");
        for (i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println("Sum of all elements: " + sum);
        sc.close();
    }
}

/*
OUTPUT:
Enter five numbers:
10
20
30
40
50
Sum of all elements: 150
*/