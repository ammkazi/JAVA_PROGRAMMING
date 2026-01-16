// Explain strings in java
public class Practical18 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        // Print the strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // String length
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());

        // Concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // Substring
        String substr = str2.substring(5, 16);
        System.out.println("Substring of String 2: " + substr);

        // Convert to uppercase
        System.out.println("String 1 in uppercase: " + str1.toUpperCase());

        // Convert to lowercase
        System.out.println("String 2 in lowercase: " + str2.toLowerCase());
    }
}

/*
OutPUT:
String 1: Hello, World!
String 2: Java Programming
Length of String 1: 13
Length of String 2: 16
Concatenated String: Hello, World! Java Programming
Substring of String 2: Programming
String 1 in uppercase: HELLO, WORLD!
String 2 in lowercase: java programming
*/