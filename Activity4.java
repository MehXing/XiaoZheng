
import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //declare 
        final double TAX = 0.08, SHIP_FEE = 5.00;
        double itemPrice, finalCost, tax;
        //input
        System.out.print("Enter the item price: $ ");
        itemPrice = in.nextDouble();
        if (itemPrice >= 25) 
        {
            tax = itemPrice * TAX;
            System.out.printf("Tax: $%.2f\n",tax);
            finalCost = itemPrice + tax;
            System.out.printf("Final Cost: $%.2f\n",finalCost);
        }
        else 
        {
            tax = itemPrice * TAX;
            System.out.println("Tax: $" + tax);
            System.out.printf("Shipping is $%.2f\n", SHIP_FEE);
            finalCost = itemPrice + tax + SHIP_FEE;
            System.out.printf("Final Cost: $%.2f\n",finalCost);
            System.out.println();
        }
        //-----------------------------------------------------Number-2--------------------------------
        //declare
        double height, weight, BMI;
        String health="";  
        //input
        System.out.print("Enter weight in kilograms: ");
        weight = in.nextDouble();
        System.out.print("Enter height in meters: ");
        height = in.nextDouble();
        //compute 
        BMI = weight / height / height;
        if (BMI < 18.5)
        {
            health = "Underweight";
        }
        else if (BMI >= 18.5 && BMI <= 24.9)
        {
            health = "Normal";
        }
        else if (BMI >= 25 && BMI <= 29.9)
        {
            health = "Overweight";
        }
        else
        {
            health = "Obese";
        }
        System.out.printf("BMI Result: %.2f\n", BMI);
        System.out.printf("%s\n",health);
    }
    
}
