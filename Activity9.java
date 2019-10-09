
import java.util.Scanner;

public class Activity9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letter;
        int k;
        String phoneNo;
        System.out.println("Number of inputs: ");
        k = in.nextInt();
        for (int j=0;j<k;j++){
            System.out.print("\n");
            phoneNo = in.next();
            for (int i = 0; i<7; i++){
                letter = phoneNo.charAt(i);
                if (i==3) System.out.print("-");
                if(letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z'){
                    switch (letter){
                        case 'A':
                        case 'a':
                        case 'B':
                        case 'b':
                        case 'C':
                        case 'c':
                            System.out.print("2");
                            break;
                        case 'D':
                        case 'd':
                        case 'E':
                        case 'e':
                        case 'F':
                        case 'f':
                            System.out.print("3");
                            break;
                        case 'G':
                        case 'g':
                        case 'H':
                        case 'h':
                        case 'I':
                        case 'i':
                            System.out.print("4");
                            break;
                        
                        case 'J':
                        case 'j':
                        case 'K':
                        case 'k':
                        case 'L':
                        case 'l':
                            System.out.print("5");
                            break;
                        case 'M':
                        case 'm':
                        case 'N':
                        case 'n':
                        case 'O':
                        case 'o':
                            System.out.print("6");
                            break;
                        case 'P':
                        case 'p':
                        case 'Q':
                        case 'q':
                        case 'R':
                        case 'r':
                        case 'S':
                        case 's':
                            System.out.print("7");
                            break;
                        case 'T':
                        case 't':
                        case 'U':
                        case 'u':
                        case 'V':
                        case 'v':
                            System.out.print("8");
                            break;
                        case 'W':
                        case 'w':
                        case 'X':
                        case 'x':
                        case 'Y':
                        case 'y':
                        case 'Z':
                        case 'z':
                            System.out.print("9");
                            break;
                    }
                }
            }
        }
    }
    
}
