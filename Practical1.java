// Defining a class, creating object, accessing class members

import java.util.Scanner;

class Person
{
    // data members
    String name;
    int age;
    Scanner sc = new Scanner(System.in);

    // member functions
    public void accept()
    {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public void display()
    {
        System.out.println("Details of the Person:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Practical1
{
    public static void main(String[] args)
    {
        // Creating an object of the Person class
        Person obj = new Person();

        obj.accept();
        obj.display();
    }
}

/*  
Output:

Enter name: Raj
Enter age: 18
Details of the Person:
Name: Raj
Age: 18

*/