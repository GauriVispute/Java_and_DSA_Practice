package Conditional_statements;

public class check_age_using_else_if_ladder{
    public static void main(String [] abc){
        // chack age using else-if ladder 

        int age = 13;

        if(age >=18) {
            System.out.println("Adult");
        } else if(age >=13 && age < 18 ) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }
}
