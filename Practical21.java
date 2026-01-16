// Wrapper classes in java
public class Practical21 {
    public static void main(String[] args) {
        // Creating Integer wrapper class object
        Integer intObj = Integer.valueOf(10);
        System.out.println("Integer Value: " + intObj);

        // Creating Double wrapper class object
        Double doubleObj = Double.valueOf(20.5);
        System.out.println("Double Value: " + doubleObj);

        // Converting Integer to int
        int intValue = intObj.intValue();
        System.out.println("Converted int Value: " + intValue);

        // Converting Double to double
        double doubleValue = doubleObj.doubleValue();
        System.out.println("Converted double Value: " + doubleValue);
    }
}

/*
OUTPUT: 
Integer Value: 10
Double Value: 20.5
Converted int Value: 10
Converted double Value: 20.5
*/

