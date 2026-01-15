// typecasting - Implicit and Explicit
public class Practical4 {
    public static void main(String[] args) {
        // Implicit typecasting
        int x = 100;
        double d = x; // int to double

        System.out.println("Implicit Typecasting:");
        System.out.println("Integer Value: " + x);
        System.out.println("Converted to Double Value: " + d);

        // Explicit typecasting
        double a = 99.99;
        int b = (int) a; // double to int

        System.out.println("\nExplicit Typecasting:");
        System.out.println("Double Value: " + a);
        System.out.println("Converted to Integer Value: " + b);   
    }
}
/*
OUTPUT:
Implicit Typecasting:
Integer Value: 100
Converted to Double Value: 100.0
Explicit Typecasting:
Double Value: 99.99
Converted to Integer Value: 99
*/