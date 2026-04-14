package Conditional_statements;

import java.util.Scanner;

public class income_tax_calculator{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       int tax ;
     
        System.out.print("Enter your Income : ");
        int income = sc.nextInt();


        if(income < 500000){
           tax= 0;
        } else if(income >=500000 && income < 1000000){
            System.out.println("20% Tax");
            tax =(int ) (income*(20.0/100));    
        } else { //income >10 
            System.out.println("30% Tax"); 
            tax = (int) (income*0.3f);
        }

        System.out.println("Tax : "+tax);

        sc.close();
    }
}