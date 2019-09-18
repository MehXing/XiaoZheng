import java.util.Scanner;
public class Activity5 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //declare 
        int num1, num2, num3, num4, num5, num6, num7, num8, sum;
        String diagnosis="";
        //input
        System.out.print("Answer each of the following questions with a number from 1 to 5 such that 1 means NEVER and 5 means ALWAYS\n");
        System.out.print("1. I am competitive: ");
        num1 = in.nextInt();
        System.out.print("2. I am annoyed by people who are late for appointments: ");
        num2 = in.nextInt();
        System.out.print("3. I perform several tasks simultaneously: ");
        num3 = in.nextInt();
        System.out.print("4. I am ambitious: ");
        num4 = in.nextInt();
        System.out.print("5. I rush to get tasks completed: ");
        num5 = in.nextInt();
        System.out.print("6. I worry about the future: ");
        num6 = in.nextInt();
        System.out.print("7. I am in a race with time: ");
        num7 = in.nextInt();
        System.out.print("8. I speak very rapidly: ");
        num8 = in.nextInt();
        sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8;
        if (sum >= 35 && sum <=40)
        {
                diagnosis = "Type A";
        }
        else if (sum >= 21 && sum <=34)
        {
                diagnosis = "between A and B, tending towards A";
        }
        else if (sum >= 12 && sum <= 20)
        {
                diagnosis = "between A and B, tending towards B";
        }
        else if (sum >= 8 && sum <= 11)
        {
                diagnosis = "Type B";
        }
            System.out.printf("Score: %d. You are %s\n\n",sum,diagnosis);
            
        //----------------------------Number-2-------------------------
        //declare
        int numa,numb,numc;
        System.out.print("Enter three numbers:");
        numa = in.nextInt();
        numb = in.nextInt();
        numc = in.nextInt();
        if (numa > numb && numa > numc)
        {
            System.out.println("Largest is " + numa);
        }
        else if (numb > numa && numb > numc)
        {
            System.out.println("Largest is " + numb);
        }
        else
        {
            System.out.println("Largest is " + numc);
        }
    }
    
}
