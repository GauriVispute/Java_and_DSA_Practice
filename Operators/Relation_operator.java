package Operators;

public class Relation_operator{
    public static void main(String [] abc){
        int A = 10;  /* A value is not changed throughout */
        int B = 10;  /* B valuse is change sometimes Acccordingly written */

        /* Equals */
    
        // System.out.println(A==B); // when B=5
        // System.out.println(A==B); // when B=10

        /* Not Equal To */

        // System.out.println(A != B); // When B =5
        // System.out.println(A != B); // When B =10

        /* Greater than */

        // System.out.println(A > B); // when B = 5
        // System.out.println(B > A); // when B = 5
        
        /* Less than */

        // System.out.println(A < B); // When B = 5
        // System.out.println(B < A); // when B = 5
        
        /* Greater Then Or Equal To */

        // System.out.println(A >= B); //when B = 5
        // System.out.println( B >= A); // when B =5
        // System.out.println(A >=B ); // When B =10
        
        /* Lesser Than Or Equal To */

        // System.out.println(A <= B); // When B = 5
        // System.out.println(B <= A); // When B = 5
        System.out.println(A <= B); // When B =10

    }
}