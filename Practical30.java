// hierarchical inheritance in Java

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}   

// Hierarchical inheritance: Cat also inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Practical30 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
    }    
}
