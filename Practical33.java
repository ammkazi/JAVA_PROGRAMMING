import java.util.Scanner;


class NoMatchException extends Exception {

    public NoMatchException(String message) {
        super(message);
    }
}

public class Practical33 {

    // Method to validate password
    static void validatePassword(String password) throws NoMatchException {
        if (!password.equals("msbte")) {
            throw new NoMatchException("Password does not match 'msbte'");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password accepted");
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

/*
Enter password: mdsa
Password does not match 'msbte'
*/