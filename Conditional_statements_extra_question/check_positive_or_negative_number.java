package Conditional_statements_extra_question;

public class check_positive_or_negative_number {
    public static void main(String[] args) {
        int number = 34;

        String result  = (number>0)?"Positve":"Negative";
        System.out.println("Result : "+result);

        if (number>0){
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}
