package Operators;

public class Logical_operator{
    public static void main(String [] abc){

        /* Logical AND */
        // System.out.println( (3>2) && (5>0) ); // T && T => T
        // System.out.println( (3<2) && (5>0) ); // F && T =>F
        // System.out.println( (3>2) && (5<0) ); // T && F => F
        // System.out.println( (3<2) && (5<0) ); // F & F => F
        
        /* Logical OR */
        // System.out.println( (3<2) || (5<0) ); // F || F => F
        // System.out.println( (3>2) || (5<0) ); // T || F => T
        // System.out.println( (3>2) || (5>0) ); // T || T => T
        // System.out.println( (3<2) || (5>0) ); // F || T => T

        /* Logical NOT */
        // System.out.println( !(3>2)); // !(T)  => F
        System.out.println( !(0>5)); // !(F) => T

    }
}