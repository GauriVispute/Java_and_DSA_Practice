package Loops;

import java.util.Scanner;
public class print_1_to_n_no_using_while_loop {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        // n is nothing but the range 
        int n = sc.nextInt();

        int counter =1;
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }

        sc.close();
    }
}
