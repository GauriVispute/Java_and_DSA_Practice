package Conditional_statements_extra_question;

public class check_fever {
    public static void main(String[] args) {
        float temp = 103.4f;

        String sick = (temp>100)?"Fever":"No Fever";
        System.out.println(sick);

        if(temp > 100){
            System.out.println("Have Fever");
        } else{
            System.out.println("Not having Fever");
        }
    }
}
