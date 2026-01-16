// string buffer classes in java
public class Practical19 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer: " + sb);
        sb.append(" World");
        System.out.println("After appending: " + sb);
        sb.insert(5, " Beautiful");
        System.out.println("After inserting: " + sb);
        sb.delete(5, 15);
        System.out.println("After deleting: " + sb);
    }
}

/*
OUTPUT:
Initial StringBuffer: Hello
After appending: Hello World
After inserting: Hello Beautiful World
After deleting: Hello World
*/

