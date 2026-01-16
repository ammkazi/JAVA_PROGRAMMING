// multilevel inheritance in java
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Name: " + name);
    }
}
class Dog extends Animal {
    private String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }
}
class Puppy extends Dog {
    private int age;
    public Puppy(String name, String breed, int age) {
        super(name, breed);
        this.age = age;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Age: " + age);
    }
}
public class Practical27 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Buddy", "Golden Retriever", 2);
        puppy.display();
    }
}


/*
Output :
Name: Buddy
Breed: Golden Retriever
Age: 2

What is multilevel inheritance?

Multilevel inheritance is a type of inheritance in object-oriented programming where a class is derived from a
subclass, forming a chain of inheritance. In this hierarchy, a base class (superclass) is extended by a derived class (subclass), which in turn is extended by another derived class (sub-subclass).
In the provided example, we have three classes: Animal (base class), Dog (derived class), and Puppy (sub-derived class). The Puppy class inherits from the Dog class, which in turn inherits from the Animal class. This creates a multilevel inheritance structure.
Advantages of Multilevel Inheritance:
1. Code Reusability: Multilevel inheritance promotes code reuse by allowing subclasses to inherit properties and methods from their parent classes.
2. Hierarchical Organization: It helps in organizing classes in a hierarchical manner, making it easier
    to understand relationships between classes.
3. Method Overriding: Subclasses can override methods from their parent classes to provide specific implementations.
4. Extended Functionality: Each level of inheritance can add its own properties and methods, enhancing
    the functionality of the derived classes.
*/