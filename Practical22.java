// Constructor and its types in java
// constructor overloading

class Book
{
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
public class Practical22 {
public static void main(String[] args) {
    // Creating objects using different constructors
    Book book1 = new Book(); // Using default constructor
    Book book2 = new Book("Java Programming", "John Doe", 50.0); // Using parameterized constructor

    // Displaying book details
    System.out.println("\nBook 1 Details:");
    book1.display();
    System.out.println("\nBook 2 Details:");
    book2.display();
    }
}

/*
Default Constructor Called

Book 1 Details:
Title: null
Author: null
Price: $0.0

Book 2 Details:
Title: Java Programming
Author: John Doe
Price: $50.0

*/
