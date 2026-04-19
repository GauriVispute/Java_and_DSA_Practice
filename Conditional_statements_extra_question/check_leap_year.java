package Conditional_statements_extra_question;

public class check_leap_year {
    public static void main(String [] abc){
        int year =2000;
        
        boolean x = (year % 4 ) == 0 ;
        boolean y = (year % 100 ) != 0;
        boolean z = (year % 100 ) == 0 && (year % 400 ) == 0;
        
        if ( x && (y || z) ){
            System.out.println(year+" It a Leap year !!");
        } else {
            System.out.println(year+" Not a Leap Year !!");
        } 

            // Display all the leap year in range 
        /* for(year = 1950 ;year<=2030;year++){
            if (x&(y||z)){
                        System.out.println(year+" It a Leap year !!");
            } else {
                //System.out.println("Not a Leap Year !!");
            } 
        } */
    }
}
