// while loop example 
// find the factorial of a number using while loop
public class Practical9 {
    public static void main(String[] args) {
        
        // number to find factorial
        int number = 5; 
        int factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial = factorial * i; 
            i++; 
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

/*
OUTPUT:
Factorial of 5 is: 120
*/