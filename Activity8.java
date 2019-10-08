
import java.util.Scanner;

public class Activity8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //-----------------------------NUMBER-2----------------------------
        System.out.println("Input a Sentence: ");
        String sent = in.nextLine();
        int count = 0;
        for (int i = 0; i < sent.length(); i++)
        {
            if (sent.charAt(i) == 'a' || sent.charAt(i) == 'e' || sent.charAt(i) == 'i'
                    || sent.charAt(i) == 'o' || sent.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.println("The number of vowels is " + count);
        //-----------------------------NUMBER-1---------------------------------
        int inNum, sum = 0, indiNum;
        System.out.print("Input Number: ");
        inNum = in.nextInt();
        inNum = Math.abs(inNum);
        do {
            indiNum = inNum%10;
            sum += indiNum;
            inNum = inNum/10;
        } while (inNum > 0);
        System.out.println("The sum is " + sum);
    }
}
