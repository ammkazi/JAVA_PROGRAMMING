//  command line arguments in java - Example 1
public class Practical23 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line arguments found.");
        } else {
            System.out.println("Command line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
