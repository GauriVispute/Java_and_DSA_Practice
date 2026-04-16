package Conditional_statements;

import java.util.Scanner;

public class calculator_by_using_switch_case{
    public static void main(String [] args){
        //calculator using 5 operators on  2 variable using switch case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter operator : ");
        char operator = sc.next().charAt(0);
        
        float result=0;
        
        switch(operator){
            case '+' : result = a+b ;
            break;
            case '-' : result = a-b;
            break;
            case '*' : result = a*b;
            break;
            case '/' : result = a/b;
            break;
            case '%' : result = a%b;
            break;
            default  : System.out.println(" Oops ! entered the wrong operator"); 
        }
        
        System.out.println("Result : "+result);

        sc.close();
    }
}