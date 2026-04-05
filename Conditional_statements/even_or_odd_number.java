package Conditional_statements;

public class even_or_odd_number{
    public static void main(String [] abc){
        int number = 79;

        // if(number % 2 == 0){
        //     System.out.println("Even Number");
        // } else {
        //     System.out.println("Odd Number");
        // }

        // using bitwise and operator

        if((number & 2) == 0){
            System.out.println("Even Number !!");
        } else {
            System.out.println("Odd Number !!");
        }
        
    }
}
