package Variable_extra_practice;

import java.util.Scanner;
public class Qn1_find_average{
    public static void main(String [] abc){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        float n1 = sc.nextFloat();

        System.out.print("Enter 2nd Number : ");
        float n2  = sc.nextFloat();

        System.out.print("Enter 3rd NUmber : ");
        float n3 = sc.nextFloat();

        float average = (n1+n2+n3)/3;
        System.out.println("Average  = "+average);

        sc.close();
    }
}