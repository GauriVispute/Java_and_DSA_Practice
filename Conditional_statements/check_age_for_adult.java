package Conditional_statements;

public class check_age_for_adult{
    public static void main(String [] abc){
        int age = 18;
        if (age>=18){
            System.out.println("Adult : Vote, drive");
        } 
        if (age >= 0 && age <=2 ){
            System.out.println("Infancy / Baby!!");
        }

        if(age >2 && age<=12){
            System.out.println("You are Child!!");
        }

        if( age >13 && age <18 ){
            System.out.println("Teenager!!");
        }else{
            System.out.println("Not Adult!!");
        }
    }
}
