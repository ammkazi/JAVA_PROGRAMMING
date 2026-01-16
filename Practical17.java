// Multidimensional arrays in java
// WAP to accept elements of 2D array and print them

import java.util.Scanner;

public class Practical17 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        Scanner sc = new Scanner(System.in);
        
        // Accepting elements of 2D array
        System.out.println("Enter elements of the 2D array (" + rows * cols + " elements):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Elements of the 2D array:
1 2 3 
4 5 6 
7 8 9 
*/
