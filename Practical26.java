// Single Level Inheritance in java
class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    private String studentId;
    public Student(String name, int age, String studentId) {
        super(name, age); // constrctor chaining
        this.studentId = studentId;
    }
    @Override
    public void display() {
        super.display(); // call parent class display method
        System.out.println("Student ID: " + studentId);
    }
}
public class Practical26 {
    public static void main(String[] args) {
        Student student = new Student("Bob", 20, "S123");
        student.display();
    }
}

/*OUTPUT:
Name: Bob   
Age: 20
Student ID: S123
*/

/*
What is inheritance in Java?
Inheritance is a fundamental concept in object-oriented programming that 
allows a new class (called a subclass or derived class) to inherit properties 
and behaviors (methods) from an existing class (called a superclass or base class).

Types of Inheritance in Java:
1. Single Inheritance: A subclass inherits from a single superclass.
2. Multilevel Inheritance: A subclass inherits from a superclass, which in turn 
   inherits from another superclass.
3. Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.
4. Hybrid Inheritance: A combination of two or more types of inheritance.
Note: Java does not support multiple inheritance (a subclass inheriting from 
more than one superclass) directly to avoid complexity and ambiguity.

Advantages of Inheritance:
1. Code Reusability: Inheritance promotes code reuse by allowing subclasses 
   to use methods and properties of the superclass.
2. Method Overriding: Subclasses can provide specific implementations of
    methods defined in the superclass.
3. Improved Maintainability: Changes made to the superclass can automatically
    propagate to subclasses, making maintenance easier.
4. Establishes Relationships: Inheritance establishes a natural hierarchy
    between classes, reflecting real-world relationships.
Disadvantages of Inheritance:
1. Increased Complexity: Inheritance can lead to complex class hierarchies,
    making the code harder to understand.
2. Tight Coupling: Subclasses are tightly coupled to their superclasses,
    which can make changes in the superclass affect subclasses unexpectedly.
3. Fragile Base Class Problem: Changes in the superclass can inadvertently
    break the functionality of subclasses.
4. Limited Flexibility: Inheritance is a static relationship defined at
    compile-time, which can limit flexibility compared to composition.

In summary, inheritance is a powerful feature in Java that promotes code reuse
and establishes relationships between classes, but it should be used judiciously
to avoid complexity and maintainability issues.

*/
