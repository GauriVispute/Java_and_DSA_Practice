package Variable_extra_practice;

import java.util.Scanner;
public class Qn2_find_square_area{
    public static void main(String [] abc){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter square side: ");
        float side  = sc.nextFloat();

        float area = side*side;
        System.out.println("Area of square : "+area);

        sc.close();
    }
}