package Conditional_statements;

public class check_student_is_pass_or_fail_by_ternary_operator {
    public static void main(String[] args) {
        int marks = 97;

        String result = (marks>=33)?"Pass":"Fail";
        System.out.println("Result : "+result);
    
    }
}
