// Explain Vector class in java - Atleast 10 methods with example
import java.util.Vector;
public class Practical20 {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<Integer> vector = new Vector<>();

        // 1. add(E e): Adds an element to the end of the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // 2. addElement(E obj): Adds an element to the end of the vector (legacy method)
        vector.addElement(40);

        // 3. get(int index): Returns the element at the specified index
        System.out.println("Element at index 2: " + vector.get(2));

        // 4. size(): Returns the number of elements in the vector
        System.out.println("Size of vector: " + vector.size());

        // 5. remove(int index): Removes the element at the specified index
        vector.remove(1);
        System.out.println("Vector after removing element at index 1: " + vector);

        // 6. contains(Object o): Checks if the vector contains the specified element
        System.out.println("Vector contains 20: " + vector.contains(20));

        // 7. isEmpty(): Checks if the vector is empty
        System.out.println("Is vector empty: " + vector.isEmpty());

        // 8. clear(): Removes all elements from the vector
        vector.clear();
        System.out.println("Vector after clear(): " + vector);

        // 9. capacity(): Returns the current capacity of the vector
        System.out.println("Capacity of vector: " + vector.capacity());

        // 10. trimToSize(): Trims the capacity of the vector to its current size
        vector.add(50);
        vector.add(60);
        System.out.println("Capacity before trimToSize(): " + vector.capacity());
        vector.trimToSize();
        System.out.println("Capacity after trimToSize(): " + vector.capacity());
    }
}

