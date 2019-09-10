import java.util.Scanner;

public class Activity2 {

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         //declare
         double fed_tax, stt_tax, ss_tax, med_tax, pen_tax, gross_amount, net_pay;
         final double HEALTH_INSURANCE = 75.00;
         String emp_name;
         //input
         System.out.println("Input:");
         System.out.print("Employee Name:");
         emp_name = in.nextLine();
         System.out.print("Gross Amount: $ ");
         gross_amount = in.nextDouble();
         //compute
         fed_tax = gross_amount * 0.15;
         stt_tax = gross_amount * 0.035;
         ss_tax = gross_amount * 0.0575;
         med_tax = gross_amount * 0.0275;
         pen_tax = gross_amount * 0.05;
         net_pay = gross_amount - fed_tax - stt_tax - ss_tax - med_tax - pen_tax - HEALTH_INSURANCE;
         //output
         System.out.println("\nOutput:");
         System.out.printf("%s \n",emp_name);
         System.out.printf("Gross Amount: $ %.2f \n",gross_amount);
         System.out.printf("Federal Tax: $ %.2f \n",fed_tax);
         System.out.printf("State Tax: $ %.2f \n",stt_tax);
         System.out.printf("Social Security Tax: $ %.2f \n",ss_tax);
         System.out.printf("Medicare/Medicaid Tax: $ %.2f \n",med_tax);
         System.out.printf("Pension Plan: $ %.2f \n",pen_tax);
         System.out.printf("Health Insurance: $ %.2f \n",HEALTH_INSURANCE);
         System.out.printf("Net Pay: $ %.2f \n\n\n\n",net_pay);
         
         //declare
         int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, rs1, rs2, rs3, rs4, rs5, rs6, rs7, rs8, rs9, rs10;
         //input
         System.out.println("Input 10 Integers");
         n1 = in.nextInt();
         rs1 = n1;
         System.out.printf("%d\t",rs1);
         n2 = in.nextInt();
         rs2 = rs1 +n2;
         System.out.printf("%d\t",rs2);
         n3 = in.nextInt();
         rs3 = rs2 + n3;
         System.out.printf("%d\t",rs3);
         n4 = in.nextInt();
         rs4 = rs3 + n4;
         System.out.printf("%d\t",rs4);
         n5 = in.nextInt();
         rs5 = rs4 + n5;
         System.out.printf("%d\t",rs5);
         n6 = in.nextInt();
         rs6 = rs5 + n6;
         System.out.printf("%d\t",rs6);
         n7 = in.nextInt();
         rs7 = rs6 + n7;
         System.out.printf("%d\t",rs7);
         n8 = in.nextInt();
         rs8 = rs7 + n8;
         System.out.printf("%d\t",rs8);
         n9 = in.nextInt();
         rs9 = rs8 + n9;
         System.out.printf("%d\t",rs9);
         n10 = in.nextInt();
         rs10 = rs9 + n10;
         System.out.printf("%d\t",rs10);
         
    }

}
