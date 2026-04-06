package Conditional_statements;

import java.util.*;

public class even_or_odd_number{
    public static void main(String [] abc){
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner (System.in);

        int number  = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // using bitwise and operator but wrong approach
    /* for(int i =0;i<100;i++){
        if(i % 2 == 0){
            if((i & 2) == 0){
                //System.out.println("Even Number !!");
                continue;
            } else {
                System.out.println(i+ " Odd Number !!");
            }
        }
    } */

        sc.close(); // just only to use in vscode
    }
}
