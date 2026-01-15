// different types of operators in java

public class Practical5 {
public static void main(String[] args) {
    int a = 15;
    int b = 4;

    // Arithmetic Operators
    System.out.println("Arithmetic Operators:");
    System.out.println("a + b = " + (a + b)); // Addition
    System.out.println("a - b = " + (a - b)); // Subtraction
    System.out.println("a * b = " + (a * b)); // Multiplication
    System.out.println("a / b = " + (a / b)); // Division
    System.out.println("a % b = " + (a % b)); // Modulus

    // Relational Operators
    System.out.println("\nRelational Operators:");
    System.out.println("a > b: " + (a > b));   // Greater than
    System.out.println("a < b: " + (a < b));   // Less than
    System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
    System.out.println("a <= b: " + (a <= b)); // Less than or equal to
    System.out.println("a == b: " + (a == b)); // Equal to
    System.out.println("a != b: " + (a != b)); // Not equal to

    // Logical Operators
    boolean x = true;
    boolean y = false;

    System.out.println("\nLogical Operators:");
    System.out.println("x && y: " + (x && y)); // Logical AND
    System.out.println("x || y: " + (x || y)); // Logical OR
    System.out.println("!x: " + (!x));           // Logical NOT
    }    
}

/*
OUTPUT:
Arithmetic Operators:
a + b = 19
a - b = 11
a * b = 60
a / b = 3
a % b = 3
Relational Operators:
a > b: true
a < b: false
a >= b: true
a <= b: false
a == b: false
a != b: true
Logical Operators:
x && y: false
x || y: true
!x: false
*/