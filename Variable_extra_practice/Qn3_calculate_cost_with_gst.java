package Variable_extra_practice;

import java.util.Scanner;
public class Qn3_calculate_cost_with_gst{
    public static void main(String [] abc){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of Pen : ");
        float cost_of_pen = sc.nextFloat();

        System.out.print("Enter cost of Pencil : ");
        float cost_of_pencil =sc.nextFloat();

        System.out.print("Enter cost of Erase : ");
        float cost_of_erase = sc.nextFloat();

        float average_and_gst = ((cost_of_pen+cost_of_pencil+cost_of_erase)/3)+0.18f;

        System.out.print("Bill = "+average_and_gst+" (including 18% gst)");

        sc.close(); // needed to close the resourse in VSCODE IDE
    }
}