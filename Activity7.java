
import java.util.Scanner;

public class Activity7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int var, p1, p3, remain;
        System.out.print("Enter a three-digit number: ");
        var = in.nextInt();
        p1 = var / 100;
        remain = var % 100;
        p3 = remain % 10;
        if (p1 == p3) System.out.println(var + " is a palindrome.");
        else System.out.println(var + " is not a palindrome.\n");
        //-------------------------------Number 2-----------------------------
        int day, elapsedDay, realDay;
        String Day="", ElapsedDay="";
        //input
        System.out.print("Enter today's day (0-6): ");
        day = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        elapsedDay = in.nextInt();
        switch (day) {
            case 0:
                Day = "Sunday";
                break;
            case 1:
                Day = "Monday";
                break;
            case 2:
                Day = "Tuesday";
                break;
            case 3:
                Day = "Wednesday";
                break;
            case 4:
                Day = "Thursday";
                break;
            case 5:
                Day = "Friday";
                break;
            case 6:
                Day = "Saturday";
                break;
        }
        realDay = (day + elapsedDay) % 7;
        switch (realDay) {
            case 0:
                ElapsedDay = "Sunday";
                break;
            case 1:
                ElapsedDay = "Monday";
                break;
            case 2:
                ElapsedDay = "Tuesday";
                break;
            case 3:
                ElapsedDay = "Wednesday";
                break;
            case 4:
                ElapsedDay = "Thursday";
                break;
            case 5:
                ElapsedDay = "Friday";
                break;
            case 6:
                ElapsedDay = "Saturday";
                break;
        }
        System.out.println("Today is " + Day + " and the future day is " + ElapsedDay);
    }
    
}
