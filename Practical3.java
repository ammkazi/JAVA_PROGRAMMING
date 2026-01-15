// scope of variables in Java
public class Practical3 {
    public static void main(String[] args) {
        int a = 10; // local variable

        {
            // start of a new block
            int b = 20; // local variable to this block
            System.out.println("Inside block:");
            System.out.println("a = " + a); // accessible
            System.out.println("b = " + b); // accessible
        } // end of block

        System.out.println("Outside block:");
        System.out.println("a = " + a); // accessible
        // System.out.println("b = " + b); // Error: b cannot be resolved to a variable
    }
}

/*
OUTPUT:
Inside block:
a = 10
b = 20
Outside block:
a = 10
*/