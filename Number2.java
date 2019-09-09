
import java.util.Scanner;
public class Number2 {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        //declare
        double pizzaPrice = 12.00 , addTop = 1.50 , tax = 0.05, cost;
        int numTop, numPizzas;
        //input
        System.out.println("Input:");
        System.out.print("Enter the number of pizzas: ");
        numPizzas = in.nextInt();
        System.out.print("Enter the total number of toppings: ");
        numTop = in.nextInt();
        //compute
        cost = (pizzaPrice * numPizzas + addTop * numTop) + ((pizzaPrice * numPizzas + addTop * numTop) * tax);
        //output
        System.out.println("Output:");
        System.out.printf("Receipt: Number of Pizzas : %d \n",numPizzas);
        System.out.printf("Number of Toppings: %d \n",numTop);
        System.out.printf("Cost(incl tax) : %.2f", cost);
    }
}
