package Variable_and_Datatype;
import java.util.Scanner;
public class type_conversion{
    public static void main(String [] args){
        /* 
        int a = 25;
        long b = a;
        System.out.println(b);
        

       -> lossy conversion
        
        long a =25 ;
        int b = a;
        System.out.print(a);  // not allowed 
        
        Scanner sc = new Scanner (System.in);
        int number = sc.nextFloat();
        System.out.println(number);  // not allowed 
        */

        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        float number = sc.nextInt();
        System.out.println(number); // this allowed

    }
}