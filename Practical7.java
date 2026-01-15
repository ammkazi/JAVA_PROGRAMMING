//  decision making in java
// switch case

import java.util.Scanner;

public class Practical7 {
    public static void main(String[] args) {
        int day;
        String dayName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        day = sc.nextInt();

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day " + day + " is " + dayName);
        sc.close();
    }
}

/*
OUTPUT:
Enter a number (1-7) to get the corresponding day of the week: 3
Day 3 is Wednesday
*/
