
import java.util.Random;
import java.util.Scanner;

public class Activity6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        long phoneNumber, remainder;
        long firstPart, secondPart, thirdPart;
        //input
        System.out.print("Enter a 10-digit phone number:");
        phoneNumber = in.nextLong();
        firstPart = phoneNumber / 10000000;
        remainder = phoneNumber % 10000000;
        secondPart = remainder / 10000;
        thirdPart = remainder % 10000;
        if (firstPart == 800 || firstPart == 888 || firstPart == 877 || firstPart == 866) 
            System.out.println(firstPart + "-" + secondPart + "-" + thirdPart + 
                    " is a toll-free number.");
        else
            System.out.println(firstPart + "-" + secondPart + "-" + thirdPart + 
                    " is not a toll-free number.\n");
        //---------------------------Number-2-------------------------------
        Random rand = new Random();
        //declare
        int player, computer;
        String choice;
        System.out.println("Rock = 0; Scissors = 1; Paper = 2 --");
        System.out.print("Choose: ");
        player = in.nextInt();
        computer = rand.nextInt(3);
        System.out.println("The computer chooses " + computer);
        if (player == computer) System.out.println("Draw");
        else if ((player == 0) && (computer == 1)) 
        {
            System.out.println("Player: Rock \nComputer: Scissors");
            System.out.println("Player win");
        }
        else if ((player == 0) && (computer == 2))
        {
            System.out.println("Player: Rock \nComputer: Paper");
            System.out.println("Player lose");
        }
        else if ((player == 1) && (computer == 0))
        {
            System.out.println("Player: Scissors \nComputer: Rock");
            System.out.println("Player lose");
        }
        else if ((player == 1) && (computer == 2))
        {
            System.out.println("Player: Scissors \nComputer: Paper");
            System.out.println("Player win");
        }
        else if ((player == 2) && (computer == 0))
        {
            System.out.println("Player: Paper \nComputer: Rock");
            System.out.println("Player win");
        }
        else if ((player == 2) && (computer == 1))
        {
            System.out.println("Player: Paper \nComputer: Scissors");
            System.out.println("Player lose");
        }
        else System.out.println("Error");
        
        
    }
    
}
