// Interface in java

interface Printable {
    void print(); // Abstract method (no body)
}

// Implement the Interface
class Document implements Printable {
    // Providing the body for the abstract method
    public void print() {
        System.out.println("Printing the document...");
    }
}

public class Practical31 {
public static void main(String[] args) {
    Document d = new Document();
    d.print();  
    }    
}

/*
Output :
Printing the document...
*/
