import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //declare
        final int MINUTES_IN_AN_HOUR = 60;
        final int SECONDS_IN_A_MINUTE = 60;
        int time;
        //input
        System.out.println("Input:");
        System.out.print("Enter time in seconds:");
        time = in.nextInt();
        //compute
        int seconds = time % SECONDS_IN_A_MINUTE;
        int totalMinutes = time / SECONDS_IN_A_MINUTE;
        int minutes = totalMinutes % MINUTES_IN_AN_HOUR;
        int hours = totalMinutes / MINUTES_IN_AN_HOUR;
        //output
        System.out.printf("Output:\nTime is %d hours %d minutes %d seconds \n\n", hours, minutes, seconds);     
        /*-----------------------------------Number----2--------------------------------------------*/
        //declare
        double distance, miles, price, cost;
        //input
        System.out.println("Input:");
        System.out.print("Enter the driving distance: ");
        distance = in.nextDouble();
        System.out.print("Enter miles per gallon: ");
        miles = in.nextDouble();
        System.out.print("Enter price per gallon: ");
        price = in.nextDouble();
        //compute
        cost = distance / miles * price;
        //output
        System.out.println("Output:");
        System.out.printf("The cost of driving is $%.2f",cost);
    }
    
}
