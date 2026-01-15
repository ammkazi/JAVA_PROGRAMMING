// Array in java - Single Dimensional Array
// Create an array of size 10 with default values.
// find the min and max values in the array.

public class Practical16 {
    public static void main(String[] args) {
        // declare and initialize an array of size 10
        int[] numbers = {15, 22, 8, 19, 31, 4, 13, 27, 6, 10};

        // find the min and max values in the array
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // print the min and max values
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }
}

/*
OUTPUT:
Minimum value in the array: 4
Maximum value in the array: 31
*/
