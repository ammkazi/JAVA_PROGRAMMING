// class and object in java
// Define a class emp with data members as eid, name, display data for one object

import java.util.Scanner;

class Emp {
    int eid;
    String name;
    Scanner sc = new Scanner(System.in);
    void accept() {
        System.out.print("Enter Employee ID: ");
        eid = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }

    void display() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + name);
    }
}
public class Practical28 {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.accept();
        e.display();
    }
}
